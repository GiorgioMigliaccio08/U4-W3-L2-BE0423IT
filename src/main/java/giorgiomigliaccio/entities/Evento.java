package giorgiomigliaccio.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name = "eventi")
public class Evento {
    @Id
    private long id;

    @Column (name= "titolo")
    private String titolo;

    @Column (name= "dataEvento")
    private String dataEvento;

    @Column (name= "tipoEvento")
    private tipoEvento tipoEvento;

    @Column (name= "numeroMassimoPartecipanti")
    private Integer numeroMassimoPartecipanti;

    public Evento(String titolo, String dataEvento, tipoEvento tipoEvento, Integer numeroMassimoPartecipanti ) {
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

    public Integer getNumeroMassimoPartecipanti() {
        return numeroMassimoPartecipanti;
    }

    public void setNumeroMassimoPartecipanti(Integer numeroMassimoPartecipanti) {
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }
}
