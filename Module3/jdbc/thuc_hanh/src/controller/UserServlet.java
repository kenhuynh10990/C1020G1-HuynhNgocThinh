package controller;

import bean.User;
import service.UserService;
import service.impl.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "UserServlet", urlPatterns = {"", "/users"})
public class UserServlet extends HttpServlet {
    private UserService userService = new UserServiceImpl();
    User user;
    int id;
    String name;
    String email;
    String country;
    User newUser;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String actionUser = request.getParameter("actionUser");
        if (actionUser == null) {
            actionUser = "";
        }
        switch (actionUser) {
            case "create":
                createSuccess(request, response);
                break;
            case "update":
                updateSuccess(request, response);
                break;
        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        String actionUser = request.getParameter("actionUser");
        if (actionUser == null) {
            actionUser = "";
        }

        try {
            switch (actionUser) {
                case "create":
                    showNewForm(request, response);
                    break;
                case "update":
                    showEditForm(request, response);
                    break;
                case "delete":
                    deleteUser(request, response);
                    break;
                case "search":
                    searchCountry(request, response);
                    break;
                case "permision":

                    addUserPermision(request, response);

                    break;
                default:
                    showList(request, response);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void addUserPermision(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        User user = new User("kien", "kienhoang@gmail.com", "vn");

        int[] permision = {1, 2, 4};

        userService.addUserTransaction(user, permision);

    }
    private void showList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("listUser", userService.selectAllUsers());
        request.getRequestDispatcher("main.jsp").forward(request, response);
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("create.jsp").forward(request, response);
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
    //        user = userService.selectUser(id);
        user=userService.getUserById(id);
        request.setAttribute("user", user);
        request.getRequestDispatcher("update.jsp").forward(request, response);
    }

    private void deleteUser(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        int id_delete = Integer.parseInt(request.getParameter("id"));
        userService.deleteUser(id_delete);
        List<User> listUser = userService.selectAllUsers();
        request.setAttribute("listUser", listUser);
        request.getRequestDispatcher("main.jsp").forward(request, response);
    }

    private void searchCountry(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        String country = request.getParameter("country");
        if (country == null) {
            country = "";
        }
        List<User> listUser1 = userService.search(country);
        if (listUser1.isEmpty()) {
            request.getRequestDispatcher("error.jsp").forward(request, response);
        } else {
            request.setAttribute("listUser", listUser1);
            request.setAttribute("country", country);
            request.getRequestDispatcher("main.jsp").forward(request, response);
        }
    }

    private void createSuccess(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

//        userService.insertUser(newUser);
        try {
            name = request.getParameter("name");
            email = request.getParameter("email");
            country = request.getParameter("country");
            newUser = new User(0, name, email, country);
            userService.insertUserStore(newUser);
            request.setAttribute("listUser", userService.selectAllUsers());
            request.getRequestDispatcher("main.jsp").forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private void updateSuccess(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        id = Integer.parseInt(request.getParameter("id"));
        name = request.getParameter("name");
        email = request.getParameter("email");
        country = request.getParameter("country");
        newUser = new User(id, name, email, country);
        userService.updateUser(newUser);
        request.setAttribute("listUser", userService.selectAllUsers());
        request.getRequestDispatcher("main.jsp").forward(request, response);
    }

}
