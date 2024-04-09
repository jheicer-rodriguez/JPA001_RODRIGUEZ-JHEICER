package pe.edu.cibertec.main;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.dominio.alumnos;

public class EliminarAlumnos {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("estudiantes");
        EntityManager em = emf.createEntityManager();

        alumnos alum = em.find(alumnos.class,"55443322");

        em.getTransaction().begin();
        em.remove(alum);
        em.getTransaction().commit();

    }
}
