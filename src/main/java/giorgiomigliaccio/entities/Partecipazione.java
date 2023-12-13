package giorgiomigliaccio.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



public class Partecipazione {

    @Table(name = "partecipazione")
    public class partecipazione {
        @Id
        @GeneratedValue
        private long id;


        @Column(name = "persona")
        private String persona;

        @Column(name = "evento")
        private String evento;

        @Column(name = "stato")
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
        }
    }
