package dhbwka.wwi.vertsys.www19b40.aufgabe2b.backend.repository;

import dhbwka.wwi.vertsys.www19b40.aufgabe2b.backend.model.Organization;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Repository-Interface für den Datenbankzugriff auf Organization
 * Verschiedene Funktionen zum Schreiben und Löschen usw.
 */

@RepositoryRestResource(collectionResourceRel = "organization", path = "organization")          // Webservice automatisch generieren
public interface OrganizationRepository extends PagingAndSortingRepository<Organization, Long> {

    List<Organization> findByNameContains(String name);
}
