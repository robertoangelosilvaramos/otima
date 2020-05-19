package com.kazale.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kazale.api.model.Empresa;
import com.kazale.api.repositories.EmpresaService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/empresas"})
public class EmpresaController {

	@Autowired
	EmpresaService service;
	
	@GetMapping
	public List<Empresa>listar(){
		return service.listar();
	}
	
	@PostMapping
	public Empresa salvar(@RequestBody Empresa e) {
		return service.add(e);
	}
	
	@GetMapping(path = { "/{id}" })
	public Empresa listarId(@PathVariable("id")Long id) {
		return service.listarId(id);
	}
	
	@PutMapping(path = { "/{id}" })
	public Empresa editar(@RequestBody Empresa p, @PathVariable("id")Long id) {
		p.setId(id);
		return service.edit(p);
	}
	
	@DeleteMapping(path = { "/{id}" })
	public Empresa delete(@PathVariable("id")Long id) {
		return service.delete(id);
	}

}
