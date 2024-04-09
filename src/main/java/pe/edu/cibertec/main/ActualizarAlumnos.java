package pe.edu.cibertec.main;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.dominio.alumnos;

public class ActualizarAlumnos {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("estudiantes");
        EntityManager em = emf.createEntityManager();

        alumnos alum = em.find(alumnos.class, "45678901");
        alum.setDireccion("los Alamos 125");

        em.getTransaction().begin();
        em.merge(alum);
        em.getTransaction().commit();

    }
}
