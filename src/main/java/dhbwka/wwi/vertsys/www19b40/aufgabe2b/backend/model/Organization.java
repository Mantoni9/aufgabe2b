package dhbwka.wwi.vertsys.www19b40.aufgabe2b.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Datenbankentität für eine Organisation
 */

@Entity                 // Diese Klasse ist eine Datenbankentität
@Data                   // Getter und Setter automatisch generieren
@NoArgsConstructor      // Default Konstruktor automatisch generieren
@AllArgsConstructor     // Konstruktor mit Parametern automatisch generieren
public class Organization implements Serializable {

    @Id                 // Schlüsselfeld der Entität
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 100)
    @NotNull(message ="Der Name der Organization darf nicht leer sein!")
    private String name = "";

    @OneToMany(mappedBy = "organization")
    private List<Employee> employeeList = new ArrayList<>();
}
