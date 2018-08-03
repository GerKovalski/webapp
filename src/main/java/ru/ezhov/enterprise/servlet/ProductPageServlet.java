package ru.ezhov.enterprise.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = ProductPageServlet.NAME, urlPatterns = {"/product"})
public class ProductPageServlet extends HttpServlet {

    public static final String NAME = "ProductPageServlet";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("productPage.jsp").forward(req, resp);
    }

}
