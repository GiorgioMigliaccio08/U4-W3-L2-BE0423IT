package giorgiomigliaccio;

import giorgiomigliaccio.dao.EventiDAO;
import giorgiomigliaccio.entities.Evento;
import giorgiomigliaccio.entities.tipoEvento;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneeventi");

    public static void main(String[] args){
        System.out.println("HELLO WORLD");
        EntityManager em = emf.createEntityManager();
        EventiDAO sd = new EventiDAO(em);

        Evento  Concerto = new Evento("Live Moda", "luglio 2023", tipoEvento.PUBBLICO, "50" );

        sd.save(Concerto);
        em.close();
        emf.close();
    }
}
