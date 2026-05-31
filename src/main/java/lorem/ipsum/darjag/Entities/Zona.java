package lorem.ipsum.darjag.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="zonas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Zona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long idzona;

    @Column(name = "nombre", length = 67)
    private String nombre;

}
