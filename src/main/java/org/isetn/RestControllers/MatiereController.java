package org.isetn.RestControllers;

import java.util.List;

import org.isetn.entities.Classe;
import org.isetn.entities.Etudiant;
import org.isetn.entities.Matiere;

import org.isetn.repository.MatiereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("matiere")
@CrossOrigin(origins="*")
public class MatiereController {
	@Autowired
	private MatiereRepository matiereRepository;

	
	  @PostMapping("/add") public Matiere add(@RequestBody Matiere matiere ) {
	  
	  return matiereRepository.save(matiere); }
	 
	 

	
	  @GetMapping("/all") public List<Matiere> getAll() { return
	  matiereRepository.findAll(); }
	  
	  @DeleteMapping("/delete") public void delete(@Param("id") Long id) { Matiere
	  c = matiereRepository.findById(id).get(); matiereRepository.delete(c); }
	  
	  @PutMapping("/update") public Matiere update(@RequestBody Matiere matiere)
	  { return matiereRepository.save(matiere); }
	  
	  @GetMapping("/{id}")
	    public Matiere getClasseById(@PathVariable("id") Long id) {
	        return matiereRepository.findById(id).get();
	    }
	  
	 

	 
}
