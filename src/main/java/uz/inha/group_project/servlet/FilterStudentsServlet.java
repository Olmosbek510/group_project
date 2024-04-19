package uz.inha.group_project.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import uz.inha.group_project.entity.Student;
import uz.inha.group_project.entity.User;
import uz.inha.group_project.repo.StudentRepo;
import uz.inha.group_project.repo.UserRepo;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "FilterUserByName" , value = "/student/filter")
public class FilterStudentsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String parameter = req.getParameter("username");
        List<Student> students = StudentRepo.getAll();
        List<Student> list = students.stream().filter(student -> student.getFirstName().concat(student.getLastName()).contains(parameter)).toList();
        HttpSession session = req.getSession();
        session.setAttribute("students", list);
        resp.sendRedirect("/index.jsp");
    }
}
