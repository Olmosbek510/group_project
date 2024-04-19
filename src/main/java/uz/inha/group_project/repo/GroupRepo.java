package uz.inha.group_project.repo;

import uz.inha.group_project.entity.Group;
import uz.inha.group_project.entity.Student;

import java.util.List;

import static uz.inha.group_project.config.DB.entityManager;

public class GroupRepo {


    public static List<Group> getAll() {

        return entityManager.createQuery("from Group ", Group.class).getResultList();

    }
}
