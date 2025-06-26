package rs.ac.singidunum.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "planovi_treninga")
@NoArgsConstructor
@Getter
@Setter

public class planovi_treninga {

    @Entity
    @Table(name = "treningbp")
    public class TreningBP {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "plan_id")
        private Integer id;

        @Column(nullable = false)
        private Integer trenerID;

        @Column(nullable = false)
        private Integer vezbaID;

        @Column(nullable = false)
        private Integer pauza;

        @Column(nullable = false)
        private LocalDateTime vreme_nastanka;

        private LocalDateTime vreme_izmene;

        @JsonIgnore
        private LocalDateTime deletedAt;

}
}
