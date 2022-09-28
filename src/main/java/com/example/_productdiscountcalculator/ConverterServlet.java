package com.example.javawebcurrencyconverter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ConverterServlet", value = "/convert")
public class ConverterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("description");
        float price = Float.parseFloat(request.getParameter("listPrice"));
        float discount = Float.parseFloat(request.getParameter("discountPercent"));
        float dAmount = (float) (price * discount * 0.01);
        float dcPrice = price - dAmount;

        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html lang=\"vi\">");
        printWriter.println("<meta charset = \"UTF-8\">");
        printWriter.println("<h1> Product Description: " + name + "</h1>");
        printWriter.println("<h1> List Price: " + price + "</h1>");
        printWriter.println("<h1> Discount Percent:" + discount + "%</h1>");
        printWriter.println("<h1> Discount Amount: " + dAmount + "</h1>");
        printWriter.println("<h1> Discount Price: " + dcPrice + "</h1>");
        printWriter.println("</html>");
    }
}
