package dhbwka.wwi.vertsys.www19b40.aufgabe2b.backend.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Datenbankentität für eine Schicht eines Mitarbeiters
 */

@Entity                 // Diese Klasse ist eine Datenbankentität
@Data                   // Getter und Setter automatisch generieren
@NoArgsConstructor      // Default Konstruktor automatisch generieren
@AllArgsConstructor     // Konstruktor mit Parametern automatisch generieren
public class Shift implements Serializable {

    @Id                 // Schlüsselfeld der Entität
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Employee employee;

    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate date;

    @JsonFormat(pattern = "HH:mm")
    private LocalTime startTime;

    @JsonFormat(pattern = "HH:mm")
    private LocalTime endTime;

    @Column(length = 100)
    @Size(min = 0, max = 100,message = "Maximal 100 Zeichen")
    private String comment;

}
