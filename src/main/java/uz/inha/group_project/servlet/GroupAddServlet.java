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

        System.out.println("Salom");
        String name = req.getParameter("groupName");
        System.out.println(name);

        Group group = Group.builder()
                .name(name)
                .build();
        System.out.println(group);

        entityManager.getTransaction().begin();
        entityManager.persist(group);
        entityManager.getTransaction().commit();

        resp.sendRedirect("/group.jsp");


    }
}
