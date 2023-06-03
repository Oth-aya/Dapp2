package controlleur;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;
import exception.ResourceNotFoundException;
import model.Etudiant;

@RestController
@RequestMapping("/Etudiant")
public class Controlleur {
	
	
	@Autowired
	private Repository.EtudiantRepository EtudiantRepository ;
	
	// get all  Etudiant
	@GetMapping("/ getAlEtudiant")
	public java.util.List<Etudiant> getAllEtudiant(){
		return  EtudiantRepository.findAll();
	}		
	
	// create  Etudiant 
	@PostMapping("/ AddEtudiant")
	public  Etudiant createEmployee(@RequestBody  Etudiant  Etudiant) {
		return  EtudiantRepository.save( Etudiant);
	}
	
	// get  Etudiant by id 
	@GetMapping("/ getEtudiant/{id}")
	public ResponseEntity< Etudiant> getEtudiantById(@PathVariable Long id) {
		 Etudiant  Etudiant =  EtudiantRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
		return ResponseEntity.ok( Etudiant);
	}
	
	// update  Etudiant 
	
	@PutMapping("/ UpdateEtudiant/{id}")
	public ResponseEntity<Etudiant> updateEtudiant(@PathVariable Long id, @RequestBody  Etudiant  EtudiantDetails){
		 Etudiant  Etudiant =  EtudiantRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException(" Etudiant not exist with id :" + id));
		
		 Etudiant.setFirstName( EtudiantDetails.getFirstName());
		 Etudiant.setLastName( EtudiantDetails.getLastName());
		 Etudiant.setEmailId( EtudiantDetails.getEmailId());
		 Etudiant.setBirthday(EtudiantDetails.getBirthday());
		 Etudiant.setNumerotele(EtudiantDetails.getNumerotele());
		 Etudiant.setPwd(EtudiantDetails.getPwd());
		 
		 
		 Etudiant  updateEtudiant =  EtudiantRepository.save( Etudiant);
		return ResponseEntity.ok(updateEtudiant);}
	
	
	// delete  Etudiant 
	@DeleteMapping("/ deleteEtudiant/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteEtudiant(@PathVariable Long id){
		 Etudiant  Etudiant =  EtudiantRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException(" Etudiant not exist with id :" + id));
		
		 EtudiantRepository.delete( Etudiant);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
		
	}
	

}
	
	
	


