package rs.ac.singidunum.programskijezici2025.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name = "vezbe")
public class Vezba {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vezbaId;

    @NotNull
    private String naziv;

    @NotNull
    private String opis;

    @NotNull
    private Integer trajanje;

}
