package com.linyoulin;

import javax.servlet.*;
import javax.servlet.FilterConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by linyo_000 on 2017/2/16.
 */
public class LoginFilter implements Filter {
    private List<String> excludeURL = new ArrayList<String>();

    public void init(FilterConfig filterConfig) throws ServletException {
        excludeURL.add(filterConfig.getServletContext().getContextPath() + "/login.jsp");
        excludeURL.add(filterConfig.getServletContext().getContextPath() + "/login.do");
        System.out.print("servletContextName:" + filterConfig.getServletContext().getContextPath());
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
        HttpSession session = httpServletRequest.getSession(true);

        if(this.excludeURL.contains(httpServletRequest.getRequestURI())){
            filterChain.doFilter(httpServletRequest, httpServletResponse);
            return;
        }

        boolean isLogin = false;
        if (session != null && session.getAttribute("isLogin") != null
                && !"".equals((String)session.getAttribute("isLogin"))) {
            isLogin = true;
        }

        if (isLogin) {
            System.out.println("logined !!!!!");
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        } else {
            System.out.println("no login yet!!!!!");
            httpServletResponse.sendRedirect(excludeURL.get(0));
            return;
        }
    }

    public void destroy() {
        // do nothing
    }
}
