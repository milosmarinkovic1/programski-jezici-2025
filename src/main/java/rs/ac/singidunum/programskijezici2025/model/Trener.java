package rs.ac.singidunum.programskijezici2025.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name = "treneri")
public class Trener {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long trenerId;

    @NotNull
    private String ime;

    @NotNull
    private String prezime;

    @NotNull
    private String specijalnost;

    @NotNull
    private String kontakt;

}
