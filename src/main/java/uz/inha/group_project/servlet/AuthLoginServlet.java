package uz.inha.group_project.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import uz.inha.group_project.entity.User;
import uz.inha.group_project.repo.UserRepo;

import java.io.IOException;
import java.util.Objects;

@WebServlet(name = "Login", value = "/auth/login")
public class AuthLoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String password = req.getParameter("password");
        String phone = req.getParameter("phone");
        String rememberMe = req.getParameter("remember_me");


        User user = UserRepo.findUser(password, phone);

        if (user==null){
            resp.sendRedirect("/login.jsp");
        }

        else {

            HttpSession session = req.getSession();
            session.setAttribute("currentUser",user);

            if (Objects.equals(rememberMe,"on")){
                System.out.println("PPPPPPPPPPPPPPPPPPPPPPPPP");
                Cookie cookie = new Cookie("currentUser",user.getId().toString());
                cookie.setHttpOnly(true);
                cookie.setMaxAge(60*2);
                cookie.setPath("/");
                resp.addCookie(cookie);

            }
            resp.sendRedirect("/admin/admin.jsp");

        }

    }
}
