package com.example.trainee.servlets;

import com.example.trainee.beans.User;
import com.example.trainee.service.UserService;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/edit")
public class EditServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            int user_id = Integer.parseInt(request.getParameter("user_id"));
            User user = UserService.findById(user_id);
            if (user != null) {
                request.setAttribute("traineegroup", user);
                getServletContext().getRequestDispatcher("/edit.jsp").forward(request, response);
            } else {
                getServletContext().getRequestDispatcher("/notfound.jsp").forward(request, response);
            }
        } catch (Exception ex) {
            getServletContext().getRequestDispatcher("/notfound.jsp").forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            int userId = Integer.parseInt(request.getParameter("user_id"));
            String firstName = request.getParameter("first_name");
            String lastName = request.getParameter("last_name");
            int userAge = Integer.parseInt(request.getParameter("user_age"));
            User user = new User(userId, firstName, lastName, userAge);
            UserService.update(user);
            response.sendRedirect(request.getContextPath() + "/index");
        } catch (Exception ex) {
            getServletContext().getRequestDispatcher("/notfound.jsp").forward(request, response);
        }
    }
}