package org.example.controller;

import org.example.impl.TaskDAOImpl;
import org.example.model.Info;
import org.example.model.Task;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.Date;
import java.util.Scanner;

public class InfoListAppConsole {

    private static EntityManagerFactory entityManagerFactory;
    private static TaskDAOImpl taskDAO;

    public static void main() {
        EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();


        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrer la description de la tâche : ");
        String description = scanner.nextLine();
        Info info = new Info();
        info.setDescription(description);

        System.out.println("Entrer la date de fin de la tache : ");
        String date = scanner.nextLine();
        info.setFinalDate(date);

        System.out.println("Entrer la date de fin de la tache : ");
        info.setPriority();



        Task task = new Task();

        task.setTitle();
        task.setCompleted();
        em.persist(task);

        em.getTransaction().commit();
        Task tasksearch = em.find(Task.class, task.getId());
        System.out.println(task);

        em.close();
        entityManagerFactory.close();


    }
}
