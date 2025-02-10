package com;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CheckVoter", urlPatterns = { "/CheckVoter" })
public class CheckVoter extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CheckVoter</title>");
            out.println("</head>");
            out.println("<body>");
            String name = request.getParameter("uname");
            int age = Integer.parseInt(request.getParameter("age"));
            if (age < 18) {
                out.println("<h4 style=\"color:green\">" + name + " You are not eligible to vote</h4>");
            } else {
                out.println("<h4 style=\"color:brown\">" + name + " You are eligible to vote</h4>");

            }
            out.println(" <a href=\"index.html\">Home</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

@Override
 public String getServletInfo() {
 return "Short description";
 }
}