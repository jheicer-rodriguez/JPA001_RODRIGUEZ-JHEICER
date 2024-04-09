package pe.edu.cibertec.main;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import pe.edu.cibertec.dominio.alumnos;

import java.util.List;
public class QueryEscalares {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("estudiantes");
        EntityManager em = emf.createEntityManager();

        TypedQuery<String> query = em.createQuery("select a.Nombres from alumnos a where a.Apellidos = 'Hernández'", String.class);

        List<String> results = query.getResultList();
        for (String alumnos : results){
            System.out.println(alumnos);
        }
    }
}
