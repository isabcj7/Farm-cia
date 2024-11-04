package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.farmacia.Farmacia;
import com.example.demo.services.FarmaciaService;

public class FarmaciaController {

private FarmaciaService farmaciaService = new FarmaciaService();
	
	@Autowired
	public FarmaciaController (FarmaciaService farmaciaService) {
		this.farmaciaService = farmaciaService;
	}
	
	@PostMapping("/criar")
	public Farmacia criarFarmacia(@RequestBody Long farmacia) {
		return farmaciaService.salvarFarmacia(farmacia);
		
	}
		
	@GetMapping
	public List<Farmacia> buscarTodos(){
		return farmaciaService.buscarTodosFarmacia();
	}
	
	@GetMapping("/{id}")
	public Farmacia buscarPorId(@PathVariable Long id) {
		return farmaciaService.buscarMedicamentoPorId(id);
	}
	
	@DeleteMapping("/{id}")
	public void deletarMedicamento(@PathVariable Long id) {
		farmaciaService.deletarMedicamento(id);
	}
	
	@PutMapping
	public ResponseEntity<Farmacia> atualizarFarmacia(@PathVariable Long id, @RequestBody Farmacia farmacia){
		Farmacia farmaciaAtualizado = farmaciaService.atualizarFarmacia(id, farmacia);
		if(farmaciaAtualizado != null) {
			return ResponseEntity.ok(farmaciaAtualizado);
		} else {
		
		return null;
	}
}
}