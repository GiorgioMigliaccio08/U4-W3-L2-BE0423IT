package giorgiomigliaccio.entities;

import javax.persistence.*;


public class Partecipazione {
    @Entity
    @Table(name = "partecipazione")
    public class partecipazione {
        @Id
        @GeneratedValue
        private long id;


        @OneToOne(mappedBy = "persona")
        private String persona;


        private String evento;


        private statoPartecipazione statoPartecipazione;



        public partecipazione(String persona, String evento, statoPartecipazione statoPartecipazione ) {
            this.persona = persona;
            this.evento = evento;
            this.statoPartecipazione = statoPartecipazione;
        }

        public String getPersona() {
            return persona;
        }

        public void setPersona(String persona) {
            this.persona = persona;
        }

        public String getEvento() {
            return evento;
        }

        public void setEvento(String evento) {
            this.evento = evento;
        }

        public giorgiomigliaccio.entities.statoPartecipazione getStatoPartecipazione() {
            return statoPartecipazione;
        }

        public void setStatoPartecipazione(giorgiomigliaccio.entities.statoPartecipazione statoPartecipazione) {
            this.statoPartecipazione = statoPartecipazione;
        }

        @Override
        public String toString() {
            return "partecipazione{" +
                    "id=" + id +
                    ", persona='" + persona + '\'' +
                    ", evento='" + evento + '\'' +
                    ", statoPartecipazione=" + statoPartecipazione +
                    '}';
        }
    }
    }
