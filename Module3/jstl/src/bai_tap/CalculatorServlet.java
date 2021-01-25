package bai_tap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", urlPatterns = "/caculate")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float number1 = Float.parseFloat(request.getParameter("number1"));
        float number2 = Float.parseFloat(request.getParameter("number2"));
        String operator = request.getParameter("operator");
//        float result = 0;
//      try {
//          result = Caculator.caculate(number1, number2, operator);
//      } catch (Exception e){
//
//      }
//        request.setAttribute("Result", result);
//        request.getRequestDispatcher("/bai_tap/result.jsp").forward(request, response);

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Result:</h1>");
        try{
            float result = Caculator.caculate(number1, number2, operator);
            writer.println(number1 + " " + operator + " " + number2 + " = " + result);
        }catch (Exception ex){
            writer.println("Error: " + ex.getMessage());
        }
        writer.println("</html>");
    }
}
