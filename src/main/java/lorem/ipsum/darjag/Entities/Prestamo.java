package lorem.ipsum.darjag.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name="prestamos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Prestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long idprestamo;

    @Column(name = "frecuencia", length = 50)
    private String frecuencia;

    @Column(name = "monto", length = 50)
    private Float monto;

    @Column(name = "interes")
    private Float interes;

    @Column(name = "total")
    private Float total;

    @Column(name = "deuda")
    private Float deuda;

    @Column(name = "fechainicial")
    private LocalDate fechainicial;

    @Column(name = "fechavenc")
    private LocalDate fechavenc;

    @Column(name = "porcentaje")
    private Float porcentaje;

    @Column(name = "estado", length = 50)
    private String estado;


}
