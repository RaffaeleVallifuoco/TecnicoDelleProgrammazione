package it.raffo.model;

import org.hibernate.annotations.Collate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "auto")
public class Auto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "model_name", nullable = false)
    private String modelName;

    @Column(name = "plate_number", nullable = false, unique = true)
    private String plateNumber;

    @Column(name = "chaassis_number", nullable = false, unique = true)
    private String chassisNumber;

    @Column(name = "traction_type", nullable = false)
    private String tractionType;

    @OneToOne
    @JoinColumn(name = "id_persona", referencedColumnName = "id")
    private Persona owner;

    public Auto() {
    }

    public Auto(String modelName, String plateNumber, String chassisNumber, String tractionType) {
        this.modelName = modelName;
        this.plateNumber = plateNumber;
        this.chassisNumber = chassisNumber;
        this.tractionType = tractionType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getChassisNumber() {
        return chassisNumber;
    }

    public void setChassisNumber(String chassisNumber) {
        this.chassisNumber = chassisNumber;
    }

    public String getTractionType() {
        return tractionType;
    }

    public void setTractionType(String tractionType) {
        this.tractionType = tractionType;
    }

    @Override
    public String toString() {
        return "Auto [id=" + id + ", modelName=" + modelName + ", plateNumber=" + plateNumber + ", chassisNumber="
                + chassisNumber + ", tractionType=" + tractionType + ", owner=" + owner + "]";
    }

}
