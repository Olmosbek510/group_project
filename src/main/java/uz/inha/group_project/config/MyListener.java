package uz.inha.group_project.config;

import jakarta.persistence.Persistence;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.annotation.WebServlet;

@WebListener
public class MyListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        DB.entityManagerFactory = Persistence.createEntityManagerFactory("GROUP_PROJECT_1");
        DB.entityManager = DB.entityManagerFactory.createEntityManager();
        ServletContextListener.super.contextInitialized(sce);
    }

}
