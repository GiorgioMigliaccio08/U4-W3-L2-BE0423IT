package giorgiomigliaccio.entities;

import javax.persistence.*;


@Entity
@Table (name = "eventi")
public class Evento {
    @Id
    @GeneratedValue
    private long id;



    @Column (name= "titolo")
    private String titolo;

    @Column (name= "dataEvento")
    private String dataEvento;

    @Column (name= "tipoEvento")
    private tipoEvento tipoEvento;

    @Column (name= "numeroMassimoPartecipanti")
    private String numeroMassimoPartecipanti;

    public Evento (){}

    public Evento(String titolo, String dataEvento, tipoEvento tipoEvento, String numeroMassimoPartecipanti ) {
        this.titolo= titolo;
        this.dataEvento = dataEvento;
        this.tipoEvento = tipoEvento;
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(String dataEvento) {
        this.dataEvento = dataEvento;
    }

    public giorgiomigliaccio.entities.tipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(giorgiomigliaccio.entities.tipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public String getNumeroMassimoPartecipanti() {
        return numeroMassimoPartecipanti;
    }

    public void setNumeroMassimoPartecipanti(String numeroMassimoPartecipanti) {
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", Titolo='" + titolo + '\'' +
                ", Data Evento='" + dataEvento + '\'' +
                ", Tipo Evento=" + tipoEvento +
                ", N partecipanti=" + numeroMassimoPartecipanti +
                '}';
    }
}
