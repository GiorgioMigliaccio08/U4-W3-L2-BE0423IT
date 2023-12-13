package giorgiomigliaccio.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

public class Location {

    @Table(name = "location")
    public class location {
        @Id
        @GeneratedValue
        private long id;


        @Column(name = "nome")
        private String nome;

        @Column(name = "città")
        private String città;

        public location(String nome, String città) {
            this.nome = nome;
            this.città = città;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getCittà() {
            return città;
        }

        public void setCittà(String città) {
            this.città = città;
        }
    }
    }
