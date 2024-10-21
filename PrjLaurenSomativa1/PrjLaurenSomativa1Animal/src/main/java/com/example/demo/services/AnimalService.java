package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Animal;
import com.example.demo.entities.Fornecedor;
import com.example.demo.entities.Products;
import com.example.demo.repositories.AnimalRepository;
import com.example.demo.repositories.FornecedorRepository;

@Service
public class AnimalService {

	private final AnimalRepository animalrepository;
	
	@Autowired
	public AnimalService(AnimalRepository animalrepository) {
		this.animalrepository = animalrepository;
	}
	
	//cadastro do animal
	public Animal saveAnimal(Animal animal) {
		return animalrepository.save(animal);
	}
	
	public Animal getAnimalById(Long id) {
		return animalrepository.findById(id).orElse(null);
	}
	
	public List<Animal> getAllAnimal() {
		return animalrepository.findAll();
	}
	
	public void deleteAnimal(Long id) {
		animalrepository.deleteById(id);
	}
	
}

