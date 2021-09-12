package com.example.trainee.servlets;


import com.example.trainee.beans.User;
import com.example.trainee.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Set;

@WebServlet("")
public class DataCollectorServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Set<User> users = UserService.printUsers();
        request.setAttribute("users", users);

        getServletContext()
                .getRequestDispatcher("/index.jsp")
                .forward(request, response);

    }
}