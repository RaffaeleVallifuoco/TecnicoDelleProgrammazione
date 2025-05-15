package App;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table
public class Prenotazione {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "id_libro")
    private Integer idLibro;

    @Column(name = "id_cliente")
    private Integer idCliente;

    @Column(name = "dattaInizio")
    @Temporal(value = TemporalType.DATE)
    private Date dataInizio;

    @Column(name = "dattaFine")
    @Temporal(value = TemporalType.DATE)
    private Date dataFine;

    public Prenotazione() {
    }

    public Prenotazione(Integer id, Integer idLibro, Integer idCliente, Date dataInizio, Date dataFine) {
        this.id = id;
        this.idLibro = idLibro;
        this.idCliente = idCliente;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(Integer idLibro) {
        this.idLibro = idLibro;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Date getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(Date dataInizio) {
        this.dataInizio = dataInizio;
    }

    public Date getDataFine() {
        return dataFine;
    }

    public void setDataFine(Date dataFine) {
        this.dataFine = dataFine;
    }

    @Override
    public String toString() {
        return "Prenotazione [id=" + id + ", idLibro=" + idLibro + ", idCliente=" + idCliente + ", dataInizio="
                + dataInizio + ", dataFine=" + dataFine + "]";
    }

}
