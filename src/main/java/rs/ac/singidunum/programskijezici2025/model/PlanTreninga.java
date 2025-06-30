package rs.ac.singidunum.programskijezici2025.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity  // !!!!!!!
@Table(name = "planovi_treninga")
public class PlanTreninga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long planId;

    @NotNull
    private Long trenerId;

    @NotNull
    private Long vezbaId;

    @NotNull
    private Integer pauza;

    @NotNull
    private LocalDateTime vremeNastanka;
}

