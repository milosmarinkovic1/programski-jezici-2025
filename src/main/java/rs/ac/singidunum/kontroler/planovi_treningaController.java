package rs.ac.singidunum.kontroler;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rs.ac.singidunum.entitet.planovi_treninga;
import rs.ac.singidunum.repository.planovi_treningaRepository;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping(path = "/api/trening")
@CrossOrigin
@RequiredArgsConstructor





public class planovi_treningaController {
}
