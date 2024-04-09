package pe.edu.cibertec.main;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import pe.edu.cibertec.dominio.alumnos;

import java.util.List;
public class QueryIn {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("estudiantes");
        EntityManager em = emf.createEntityManager();

        TypedQuery<alumnos> query = em.createQuery("select a from alumnos a where a.Apellidos in ('Hernández', 'López')", alumnos.class);

        List<alumnos> results = query.getResultList();
        for (alumnos alu : results){
            System.out.println(alu);
        }

    }
}
