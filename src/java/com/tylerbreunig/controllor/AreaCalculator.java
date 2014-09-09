/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tylerbreunig.controllor;

import com.tylerbreunig.model.AreaCalculatorModel;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tyler
 */
@WebServlet(name = "AreaCalculator", urlPatterns = {"/AreaCalculator"})
public class AreaCalculator extends HttpServlet {

    private static final String RESULT_PAGE = "form.jsp";

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        AreaCalculatorModel acm = new AreaCalculatorModel();

        String shape = request.getParameter("shapes");

        if (shape.equals("rectangle")) {
            int height = Integer.parseInt(request.getParameter("rectangleHeight"));
            int width = Integer.parseInt(request.getParameter("rectangleWidth"));
            String results = String.valueOf(acm.calculateRectangle(height, width));
            request.setAttribute("rectangleResults", results);

        } else if (shape.equals("circle")) {
            double radius = Double.parseDouble(request.getParameter("circleRadius"));
            String results = String.valueOf(acm.calculateCircle(radius));
            request.setAttribute("circleResults", results);

        } else if (shape.equals("triangle")) {
            int base = Integer.parseInt(request.getParameter("triangleBase"));
            int height = Integer.parseInt(request.getParameter("triangleWidth"));
            String results = String.valueOf(acm.calculateTriangle(base, height));
            request.setAttribute("triangleResults", results);
        }

        RequestDispatcher view
                = request.getRequestDispatcher(RESULT_PAGE);
        view.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
