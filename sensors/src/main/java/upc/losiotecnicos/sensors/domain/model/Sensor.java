package upc.losiotecnicos.domain.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sensor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double temperatura;
    private double humedad;
    private double calor;
    private double gasMetano;

    // Getters y Setters
}