package tarcioteles.projeto.Livraria.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tarcioteles.projeto.Livraria.entities.Autor;
import tarcioteles.projeto.Livraria.repository.AutorRepository;

@Service

public class AutorService {
	
	@Autowired
	private AutorRepository repository;
	
	public Autor create(Autor obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public Autor getId(Long id) {
		Optional<Autor> obj = repository.findById(id);
		return obj.get();
	}
	
	public List<Autor> getAll() {
		return repository.findAll();
	}
	
	public Autor update(Autor obj) {
		Optional<Autor> newObj = repository.findById(obj.getId());
		updateLivro(newObj, obj);
		return repository.save(newObj.get());
	}

	private void updateLivro(Optional<Autor> newObj, Autor obj) {
		newObj.get().setNome(obj.getNome());
	}
	
	
	
}