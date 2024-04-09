package pe.edu.cibertec.main;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import pe.edu.cibertec.dominio.alumnos;

import java.sql.Timestamp;
import java.util.List;

public class QueryBetween {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("estudiantes");
        EntityManager em = emf.createEntityManager();

        Timestamp fecIni = Timestamp.valueOf("1990-01-01 00:00:00");
        Timestamp fecFin = Timestamp.valueOf("2010-12-12 24:59:59");

        TypedQuery<alumnos> query = em.createQuery("select a from alumnos a where a.Nacimiento between :fecIni and :fecFin", alumnos.class);

        query.setParameter("fecIni",fecIni);
        query.setParameter("fecFin", fecFin);

        List<alumnos> results = query.getResultList();
        for (alumnos alu : results){
            System.out.println(alu);
        }
    }

}
