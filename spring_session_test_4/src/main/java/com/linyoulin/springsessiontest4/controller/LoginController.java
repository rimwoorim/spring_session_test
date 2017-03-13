package com.linyoulin.springsessiontest4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by linyo_000 on 2017/3/13.
 */
@Controller
public class LoginController {

    @RequestMapping("/index.do")
    public String index(HttpServletRequest httpServletRequest) {
        HttpSession httpSession = httpServletRequest.getSession();
        System.out.println("Session:" + httpSession.toString());
        String userName = (String) httpSession.getAttribute("username");
        System.out.println("username:" + userName);
        return "index";
    }

    @RequestMapping("/loginPage.do")
    public String loginPage() {
        return "login";
    }

    @RequestMapping("/login.do")
    public void login(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        String userName = (String) httpServletRequest.getParameter("username");
        String password = (String) httpServletRequest.getParameter("password");

        if (userName != null && "lin".equals(userName)
                && password != null && "lin".equals(password)) {
            httpServletRequest.getSession().setAttribute("isLogin", "true");
            httpServletRequest.getSession().setAttribute("username", "caicaicai");
            String contextPath = httpServletRequest.getContextPath();
            httpServletResponse.sendRedirect(contextPath+"/index.do");
        } else {
            return;
        }
    }
}
