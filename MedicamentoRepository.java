package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.farmacia.Medicamento;

public class MedicamentoRepository {
	
	public interface UsuarioRepository extends JpaRepository<Medicamento, Long>{
		
	}

	public static Medicamento findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}