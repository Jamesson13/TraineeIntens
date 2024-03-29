package com.example.trainee.servlets;



import com.example.trainee.beans.User;
import com.example.trainee.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/insert")
public class DataInsertionServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/insert.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            String firstName = request.getParameter("first_name");
            String lastName = request.getParameter("last_name");
            int age = Integer.parseInt(request.getParameter("user_age"));
            UserService.addUser(new User(firstName, lastName, age));
            response.sendRedirect(request.getContextPath());
        } catch (Exception ex) {
            getServletContext().getRequestDispatcher("/insert.jsp").forward(request, response);
        }
    }
}
