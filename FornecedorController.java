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
import com.example.demo.farmacia.Fornecedor;
import com.example.demo.services.FornecedorService;

public class FornecedorController {

private FornecedorService fornecedorService = new FornecedorService();
	
	@Autowired
	public FornecedorController (FornecedorService fornecedorService) {
		this.fornecedorService = fornecedorService;
	}
	
	@PostMapping("/criar")
	public Fornecedor criarFornecedor(@RequestBody Long fornecedor) {
		return fornecedorService.salvarFarmacia(fornecedor);
	}
		
	@GetMapping
	public List<Fornecedor> buscarTodos(){
		return fornecedorService.buscarTodosFornecedor();
	}
	
	@GetMapping("/{id}")
	public Fornecedor buscarPorId(@PathVariable Long id) {
		return fornecedorService.buscarMedicamentoPorId(id);
	}
	
	@DeleteMapping("/{id}")
	public void deletarMedicamento(@PathVariable Long id) {
		fornecedorService.deletarMedicamento(id);
	}
	
	@PutMapping
	public ResponseEntity<Object> atualizarFornecedor(@PathVariable Long id, @RequestBody Fornecedor fornecedor){
		Fornecedor farmaciaAtualizado = fornecedorService.atualizarFornecedor(id, fornecedor);
		Object fornecedorAtualizado = null;
		if(fornecedorAtualizado != null) {
			return ResponseEntity.ok(fornecedorAtualizado);
		} else {
		
		return null;
	}
}
}