package uz.inha.group_project.config;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Arrays;

@WebFilter(urlPatterns = "/admin/*")
public class MyFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {


        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        HttpSession session = request.getSession();

        Object object = session.getAttribute("currentUser");

        if (object!=null){
            filterChain.doFilter(request,response);
        }

        else {

            boolean currentUser = Arrays.stream(request.getCookies())
                    .anyMatch(cookie -> cookie.getName().equals("currentUser"));

            if (currentUser){
                filterChain.doFilter(request,response);
            }
            else {
                response.sendRedirect("/login.jsp");
            }

        }
    }
}
