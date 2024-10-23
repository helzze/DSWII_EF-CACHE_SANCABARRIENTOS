package dsw.ef.p3.sanca.DSWII_EF_CACHE_SancaBarrientos.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Table(name = "Vehiculo")
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idvehiculo;

    private String marca;
    private String modelo;
    private Integer anio;
    private BigDecimal precio;
}
