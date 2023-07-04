/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bakery.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kle
 */
public class MainController extends HttpServlet {

    private static final String WELCOME_PAGE = "index.jsp";

    private static final String REGISTER = "Register";
    private static final String REGISTER_CONTROLLER = "RegisterController";

    private static final String LOGIN = "Login";
    private static final String LOGIN_CONTROLLER = "LoginController";

    private static final String REGISTER_PAGE = "RegisterPage";
    private static final String REGISTER_PAGE_VIEW = "register.jsp";

    private static final String GOOGLE = "Google";
    private static final String GOOGLE_CONTROLLER = "GoogleController";
    
    private static final String PRODUCT = "Product";
    private static final String PRODUCT_CONTROLLER = "ProductController";
    
    private static final String ADD_TO_CART = "AddToCart";
    private static final String ADD_TO_CART_CONTROLLER = "AddToCartController";
    
    private static final String CART_ITEM = "Cart";
    private static final String CART_ITEM_CONTROLLER = "CartItemController";
    
    private static final String DELETE_ITEM = "DeleteItem";
    private static final String DELETE_CONTROLLER = "DeleteController";
    
    private static final String UPDATE_ITEM = "UpdateItem";
    private static final String UPDATE_CONTROLLER = "UpdateController";
    
    private static final String LOGOUT = "Logout";
    private static final String LOGOUT_CONTROLLER = "LogoutController";
    
    private static final String CHECKOUT = "Checkout";
    private static final String CHECKOUT_CONTROLLER = "CheckoutController";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = WELCOME_PAGE;
        try {
            String action = request.getParameter("action");
            switch (action) {
                case REGISTER: ;
                    url = REGISTER_CONTROLLER;
                    break;
                case LOGIN: ;
                    url = LOGIN_CONTROLLER;
                    break;
                case REGISTER_PAGE: ;
                    url = REGISTER_PAGE_VIEW;
                    break;
                case GOOGLE: ;
                    url = GOOGLE_CONTROLLER;
                    break;
                case PRODUCT: ;
                    url = PRODUCT_CONTROLLER;
                    break;
                case ADD_TO_CART: ;
                    url = ADD_TO_CART_CONTROLLER;
                    break;
                case CART_ITEM: ;
                    url = CART_ITEM_CONTROLLER;
                    break;
                case DELETE_ITEM: ;
                    url = DELETE_CONTROLLER;
                    break;
                case UPDATE_ITEM: ;
                    url = UPDATE_CONTROLLER;
                    break;
                case LOGOUT: ;
                    url = LOGOUT_CONTROLLER;
                    break;
                case CHECKOUT: ;
                    url = CHECKOUT_CONTROLLER;
                    break;
                default:
                    url = WELCOME_PAGE;
            }
        } catch (Exception e) {
            log("Error at MainController: " + e.toString());
        } finally {
            request.getRequestDispatcher(url).forward(request, response);
        }
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
