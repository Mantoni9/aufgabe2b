package dhbwka.wwi.vertsys.www19b40.aufgabe2b.backend.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Datenbankentität für einen Mitarbeiter einer Organisation
 */

@Entity                 // Diese Klasse ist eine Datenbankentität
@Data                   // Getter und Setter automatisch generieren
@NoArgsConstructor      // Default Konstruktor automatisch generieren
@AllArgsConstructor     // Konstruktor mit Parametern automatisch generieren
public class Employee implements Serializable {

    @Id                 // Schlüsselfeld der Entität
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Organization organization;

    @Column(length = 100)
    @NotNull(message ="Der Nachname des Mitarbeiters darf nicht leer sein!")
    private String name = "";

    @Column(length = 100)
    @NotNull(message ="Der Vorname des Mitarbeiters darf nicht leer sein!")
    private String firstName = "";

    @NotNull(message = "Bitte tragen Sie ein gültiges Geburtsdatum ein.")
    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate birthDate;

    @OneToMany(mappedBy = "employee")
    private List<Shift> shift = new ArrayList<>();
}
