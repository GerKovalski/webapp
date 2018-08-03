package ru.ezhov.enterprise.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = OrderPageServlet.NAME, urlPatterns = {"/order"})
public class OrderPageServlet extends HttpServlet {

    public static final String NAME = "OrderPageServlet";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("orderPage.jsp").forward(req, resp);
    }

}
