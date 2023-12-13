package giorgiomigliaccio.entities;

import javax.persistence.*;

public class Location {
    @Entity
    @Table(name = "location")
    public class location {
        @Id
        @GeneratedValue
        private long id;



        private String nome;


        private String città;

        @OneToOne
        @JoinColumn(name = "location_id")
        private Location location;

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

        @Override
        public String toString() {
            return "location{" +
                    "id=" + id +
                    ", nome='" + nome + '\'' +
                    ", città='" + città + '\'' +
                    '}';
        }
    }
    }
