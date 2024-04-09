package pe.edu.cibertec.main;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;
public class QueryGroupBy {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("estudiantes");
        EntityManager em = emf.createEntityManager();

        //Crear query
        TypedQuery<Object[]> query = em.createQuery("select a.Nombres, count(*) from alumnos a group by a.Nombres", Object[].class);

        //Obtener resultado
        List<Object[]> results = query.getResultList();
        for (Object[] item : results){
            System.out.println("- " + item[0] + " | 1:" + item[1]);
        }
    }

}
