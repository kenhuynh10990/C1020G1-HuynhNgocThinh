package bai_tap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = {""})
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("1 ", "1/1/1990", "abcxyz", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRSehlreSRQ-r1JZltT3yqc7kxkqhknBt58Yg&usqp=CAU"));
        customerList.add(new Customer("2", "1/1/1990", "abcxyz", "https://nude.vn/wp-content/uploads/2020/05/nude.vn-Sam-14.jpg"));
        customerList.add(new Customer("3 ", "1/1/1990", "abcxyz", "https://vn-live-02.slatic.net/p/4067ce82f49a52f11d66be2a82b39e1e.jpg"));
        customerList.add(new Customer("4 ", "1/1/1990", "abcxyz", "https://icdn.dantri.com.vn/2018/12/25/phung-thi-ngoc-tram-1-1545739589579448856868.jpg"));
        request.setAttribute("customerServlet", customerList);
        request.getRequestDispatcher("/bai_tap/customer.jsp").forward(request, response);

    }
}
