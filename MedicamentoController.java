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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.farmacia.Medicamento;
import com.example.demo.repositories.MedicamentoRepository;
import com.example.demo.services.MedicamentoService;


@RestController
@RequestMapping("/Medicamento")
public class MedicamentoController {

private MedicamentoService medicamentoService = new MedicamentoService();
	
	@Autowired
	public MedicamentoController(MedicamentoService medicamentoService ) {
		this.medicamentoService = medicamentoService;
	}
	
	@PostMapping("/criar")
	public Medicamento criarMedicamento(@RequestBody Long medicamento) {
		return medicamentoService.salvarMedicamento(medicamento);
		
	}
		
	@GetMapping
	public List<Medicamento> buscarTodos(){
		return medicamentoService.buscarTodosMedicamentos();
	}
	
	@GetMapping("/{id}")
	public Medicamento buscarPorId(@PathVariable Long id) {
		return medicamentoService.buscarMedicamentoPorId(id);
	}
	
	@DeleteMapping("/{id}")
	public void deletarMedicamento(@PathVariable Long id) {
		medicamentoService.salvarMedicamento(id);
	}
	
	@PutMapping
	public void atualizarMedicamento(@PathVariable Long id, @RequestBody Medicamento farmacia){
		Medicamento medicamentoExistente = MedicamentoRepository.findById(id);
		if(medicamentoExistente.isPresent()) {
			Object medicamentoAtualizado;
			return;
		} else {
		
		return;
	}
}

}
