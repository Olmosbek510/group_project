package uz.inha.group_project.repo;

import jakarta.persistence.TypedQuery;
import uz.inha.group_project.entity.Student;
import uz.inha.group_project.entity.User;

import java.util.List;

import static uz.inha.group_project.config.DB.entityManager;

public class UserRepo {


    public static User findUser(String password, String phone) {
        TypedQuery<User> query = entityManager.createQuery("select s from User s where phone =:phone", User.class);
        query.setParameter("phone",phone);
        List<User> users = query.getResultList();

        if (users.isEmpty()) {
            return null;
        }
        if (users.get(0).getPassword().equals(password)){
            return users.get(0);
        }
        return null;

    }
}
