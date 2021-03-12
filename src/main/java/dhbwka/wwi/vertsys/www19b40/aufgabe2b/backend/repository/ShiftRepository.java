package dhbwka.wwi.vertsys.www19b40.aufgabe2b.backend.repository;

import dhbwka.wwi.vertsys.www19b40.aufgabe2b.backend.model.Shift;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.time.LocalDate;
import java.util.List;

/**
 * Repository-Interface für den Datenbankzugriff auf Shift
 * Verschiedene Funktionen zum Schreiben und Löschen usw.
 */

@RepositoryRestResource(collectionResourceRel = "shift", path = "shift")            // Webservice automatisch generieren
public interface ShiftRepository extends PagingAndSortingRepository<Shift, Long> {

    List<Shift> findByDateContaining(LocalDate date);
}
