package uz.inha.group_project.config;

import jakarta.persistence.Persistence;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.annotation.WebServlet;
import lombok.SneakyThrows;
import org.postgresql.Driver;

import java.sql.DriverManager;

@WebListener
public class MyListener implements ServletContextListener {
    @SneakyThrows
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        DriverManager.registerDriver(new Driver());
        DB.entityManagerFactory = Persistence.createEntityManagerFactory("GROUP_PROJECT_1");
        DB.entityManager = DB.entityManagerFactory.createEntityManager();
        ServletContextListener.super.contextInitialized(sce);
    }

}
