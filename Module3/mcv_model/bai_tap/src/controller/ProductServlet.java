package controller;

import bean.Product;
import service.ProductService;
import service.impl.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ProductServlet", urlPatterns = {"", "/productServlet"})
public class ProductServlet extends HttpServlet {
    private static ProductService productService = new ProductServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String actionUser = request.getParameter("actionUser");
        if (actionUser == null) {
            actionUser = "";
        }
        switch (actionUser) {
            case "update":
            case "create":
                Integer id = Integer.parseInt(request.getParameter("id"));
                String name = request.getParameter("name_product");
                double cost = Double.parseDouble(request.getParameter("cost"));
                Product product = new Product(id, name, cost);
                productService.save(product);


                request.setAttribute("productList", productService.findAll());
                request.getRequestDispatcher("main.jsp").forward(request, response);
                break;


        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String actionUser = request.getParameter("actionUser");
        if (actionUser == null) {
            actionUser = "";
        }
        switch (actionUser) {
            case "update":
                Integer id = Integer.parseInt(request.getParameter("id"));
                Product product = productService.findById(id);

                request.setAttribute("productInfo", product);
                request.getRequestDispatcher("update_customer.jsp").forward(request, response);
                break;
            case"delete":
                Integer id_delete= Integer.parseInt(request.getParameter("id"));
                productService.remove(id_delete);
                request.setAttribute("productList",productService.findAll());
                request.getRequestDispatcher("main.jsp").forward(request,response);
                break;
            case "create":
                request.getRequestDispatcher("create_product.jsp").forward(request,response);
                break;
            default:
                request.setAttribute("productList", productService.findAll());
                request.getRequestDispatcher("main.jsp").forward(request, response);

        }
    }
}
