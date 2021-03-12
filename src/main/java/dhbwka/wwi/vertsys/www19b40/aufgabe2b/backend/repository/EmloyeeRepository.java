package dhbwka.wwi.vertsys.www19b40.aufgabe2b.backend.repository;

import dhbwka.wwi.vertsys.www19b40.aufgabe2b.backend.model.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Repository-Interface für den Datenbankzugriff auf Employee
 * Verschiedene Funktionen zum Schreiben und Löschen usw.
 */

@RepositoryRestResource(collectionResourceRel = "employee", path = "employee")          //Webservice automatisch generieren
public interface EmloyeeRepository extends PagingAndSortingRepository<Employee, Long> {

    List<Employee> findByNameContains(String name);
    List<Employee> findByNameAndAndFirstName(String name, String firstName);

}
