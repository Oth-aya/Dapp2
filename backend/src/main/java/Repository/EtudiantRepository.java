package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Etudiant;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

}
