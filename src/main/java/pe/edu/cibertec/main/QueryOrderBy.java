package pe.edu.cibertec.main;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.Date;
import java.util.List;

public class QueryOrderBy {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("estudiantes");
        EntityManager em = emf.createEntityManager();

        TypedQuery<String> query = em.createQuery("select a.Apellidos from alumnos a order by a.Apellidos asc", String.class);

        List<String> results = query.getResultList();
        for (String alu : results){
            System.out.println(alu);
        }
    }
}
