package com.linyoulin;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by linyo_000 on 2017/2/17.
 */
public class SessionServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        String attributeName = request.getParameter("attributeName");
        String attributeValue = request.getParameter("attributeValue");
        request.getSession().setAttribute(attributeName, attributeValue);
        response.sendRedirect(request.getContextPath() + "/");
    }

    private static final long serialVersionUID = 2878267318695777395L;
}
