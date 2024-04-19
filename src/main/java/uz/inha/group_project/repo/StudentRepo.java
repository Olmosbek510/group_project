package uz.inha.group_project.repo;

import uz.inha.group_project.entity.Student;

import java.util.List;

import static uz.inha.group_project.config.DB.entityManager;

public class StudentRepo {


    public static List<Student> getAll() {

        return entityManager.createQuery("from Student ",Student.class).getResultList();

    }
}
