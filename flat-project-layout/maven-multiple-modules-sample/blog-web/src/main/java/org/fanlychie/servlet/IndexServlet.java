package org.fanlychie.servlet;

import org.fanlychie.facade.MessageFacade;
import org.fanlychie.service.MessageService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class IndexServlet extends HttpServlet {

    private final static MessageFacade messageFacade = new MessageService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        request.setAttribute("message", messageFacade.sayHi());
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

}