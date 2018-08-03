package ru.ezhov.enterprise.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = MainPageServlet.NAME, urlPatterns = {"/main"})
public class MainPageServlet extends HttpServlet {

    public static final String NAME = "MainPageServlet";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("mainPage.jsp").forward(req, resp);
    }

}
