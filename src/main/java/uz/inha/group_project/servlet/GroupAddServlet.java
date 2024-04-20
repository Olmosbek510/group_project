package uz.inha.group_project.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import uz.inha.group_project.entity.Group;

import java.io.IOException;
import java.util.Set;

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

        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<Group>> groupVal = validator.validate(group);

        if (groupVal.isEmpty()){
            entityManager.getTransaction().begin();
            entityManager.persist(group);
            resp.sendRedirect("/group.jsp");
        }

        else {
            for (ConstraintViolation<Group> groupConstraintViolation : groupVal) {

                System.out.println(groupConstraintViolation.getMessage());

            }
            resp.sendRedirect("/admin/addGroup.jsp");

        }
        entityManager.getTransaction().commit();






    }
}
