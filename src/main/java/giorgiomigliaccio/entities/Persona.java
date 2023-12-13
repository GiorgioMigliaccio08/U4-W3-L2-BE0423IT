package giorgiomigliaccio.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

public class Persona {
    @Table(name = "persona")
    public class persona {
        @Id
        @GeneratedValue
        private long id;


        @Column(name = "name")
        private String name;

        @Column(name = "surname")
        private String surname;

        @Column(name = "email")
        private String email;

        @Column(name = "data di nascita")
        private LocalDate datadinascita;

        @Column(name = "sesso")
        private String sesso;

        @Column(name = "listapartecipazioni")
        private String listapartecipazioni;

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
    }
    }
