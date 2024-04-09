package pe.edu.cibertec.main;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class QueryDistinct {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("estudiantes");
        EntityManager em = emf.createEntityManager();

        TypedQuery<String> query= em.createQuery("select distinct upper(a.Nombres) from alumnos a", String.class);

        List<String> results = query.getResultList();
        for (String alumnos : results){
            System.out.println(alumnos);
        }

    }
}

