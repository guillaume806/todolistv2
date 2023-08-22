package org.example.controller;

import org.example.impl.TaskDAOImpl;
import org.example.model.Info;
import org.example.model.Task;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class InfoListAppConsole {

    private static EntityManagerFactory entityManagerFactory;
    private static TaskDAOImpl taskDAO;

    public static void main() {
        EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();

        Info info = new Info();
        info.setDescription();
        info.setFinalDate();
        info.setPriority();



        Task task = new Task();

        task.setTitle(432);
        task.setCompleted();
        em.persist(task);

        em.getTransaction().commit();
        Task tasksearch = em.find(Task.class, task.getId());
        System.out.println(task);

        em.close();
        entityManagerFactory.close();


    }
}
