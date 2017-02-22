package com.linyoulin;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by linyo_000 on 2017/2/16.
 */
public class LoginServlet extends HttpServlet{
    @Override
    public void service(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws
            ServletException, IOException {
        String userName = (String) httpServletRequest.getParameter("username");
        String password = (String) httpServletRequest.getParameter("password");

        if (userName != null && "lin".equals(userName)
                && password != null && "lin".equals(password)) {
            httpServletRequest.getSession().setAttribute("isLogin", "true");
            String contextPath = httpServletRequest.getContextPath();
            httpServletResponse.sendRedirect(contextPath+"/hello.jsp");
        } else {
            return;
        }
    }
}
