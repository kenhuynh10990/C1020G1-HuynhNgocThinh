package controller;

import bean.Customer;
import service.CustomerService;
import service.impl.CustomerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CustomerServlet", urlPatterns = {"", "/customerServlet"})
public class CustomerServlet extends HttpServlet {
    private CustomerService customerService = new CustomerServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String actionUser = request.getParameter("actionUser");
//        if (actionUser == null) {
//            actionUser = "";
//        }
        Integer id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        Customer customer = new Customer(id, name, email, address);
        customerService.save(customer);

        request.setAttribute("customerList", customerService.findAll());
        request.getRequestDispatcher("list_customer.jsp").forward(request, response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String actionUser = request.getParameter("actionUser");
        if (actionUser == null) {
            actionUser = "";
        }
        switch (actionUser) {
            case "update":
                Integer id = Integer.parseInt(request.getParameter("id"));
                Customer customer = customerService.findById(id);

                request.setAttribute("customerInfo", customer);
                request.getRequestDispatcher("update_customer.jsp").forward(request, response);

                break;
            case "delete":
                Integer id_delete = Integer.parseInt(request.getParameter("id"));
                customerService.remove(id_delete);
                request.setAttribute("customerList", customerService.findAll());
                request.getRequestDispatcher("list_customer.jsp").forward(request, response);
                break;
            case "create":
                request.getRequestDispatcher("create_customer.jsp").forward(request, response);
                break;


            default:
                request.setAttribute("customerList", customerService.findAll());
                request.getRequestDispatcher("list_customer.jsp").forward(request, response);
        }
    }

}
