package uz.inha.group_project.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import uz.inha.group_project.entity.Group;

import java.io.IOException;

import static uz.inha.group_project.config.DB.entityManager;

@WebServlet(name = "Add group", value = "/admin/group/add")
public class GroupAddServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String name = req.getParameter("groupName");

        Group group = Group.builder()
                .name(name)
                .build();

        entityManager.persist(group);

        resp.sendRedirect("/group.jsp");


    }
}
