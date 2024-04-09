package pe.edu.cibertec.main;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.dominio.alumnos;

import java.util.Date;

public class RegistrarAlumnos {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("estudiantes");
        EntityManager em= emf.createEntityManager();

        alumnos alum = new alumnos("55324501","Elena","Sánchez",
                new Date(),"elena.sanchez@gmail.com","Callejón del Recuerdo 222");

        em.getTransaction().begin();
        em.persist(alum);
        em.getTransaction().commit();

        alumnos alumnew = em.find(alumnos.class,"55324501");
        System.out.println(alumnew);

    }
}
