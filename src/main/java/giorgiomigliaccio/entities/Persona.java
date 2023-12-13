package giorgiomigliaccio.entities;

import javax.persistence.*;
import java.time.LocalDate;

public class Persona {
    @Entity
    @Table(name = "persona")
    public class persona {
        @Id
        @GeneratedValue
        private long id;



        private String name;


        private String surname;


        private String email;


        private LocalDate datadinascita;


        private String sesso;


        private String listapartecipazioni;

        @OneToOne
        @JoinColumn (name = "partecipazione_id")
        private Partecipazione partecipazione;

        public persona(long id, String name, String surname, String email, LocalDate datadinascita, String sesso, String listapartecipazioni) {
            this.id = id;
            this.name = name;
            this.surname = surname;
            this.email = email;
            this.datadinascita = datadinascita;
            this.sesso = sesso;
            this.listapartecipazioni = listapartecipazioni;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public LocalDate getDatadinascita() {
            return datadinascita;
        }

        public void setDatadinascita(LocalDate datadinascita) {
            this.datadinascita = datadinascita;
        }

        public String getSesso() {
            return sesso;
        }

        public void setSesso(String sesso) {
            this.sesso = sesso;
        }

        public String getListapartecipazioni() {
            return listapartecipazioni;
        }

        public void setListapartecipazioni(String listapartecipazioni) {
            this.listapartecipazioni = listapartecipazioni;
        }

        @Override
        public String toString() {
            return "persona{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", email='" + email + '\'' +
                    ", datadinascita=" + datadinascita +
                    ", sesso='" + sesso + '\'' +
                    ", listapartecipazioni='" + listapartecipazioni + '\'' +
                    '}';
        }
    }
    }
