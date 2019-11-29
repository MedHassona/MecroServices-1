package ma.lnet;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@RepositoryRestResource
@CrossOrigin("*")
public interface EmployeurRepo extends JpaRepository<Employeur, Long> {
	public List<Employeur> findByNomContains(String nom);
}
