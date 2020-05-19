package com.kazale.api.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kazale.api.model.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {
	
	List<Empresa> findAll();

	Empresa findById(Long id);

	Empresa save(Empresa e);

	void delete(Empresa e);

}
