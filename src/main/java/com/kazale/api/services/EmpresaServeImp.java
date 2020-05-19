package com.kazale.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kazale.api.model.Empresa;
import com.kazale.api.repositories.EmpresaRepository;
import com.kazale.api.repositories.EmpresaService;

@Service
public class EmpresaServeImp implements EmpresaService {

	@Autowired
	private EmpresaRepository repositorio;

	@Override
	public List<Empresa> listar() {
		// lista todas empresas
		return repositorio.findAll();
	}

	@Override
	public Empresa listarId(Long id) {
		// lista por id
		return this.repositorio.findById(id);
	}

	@Override
	public Empresa edit(Empresa e) {
		// edita uma empresa
		return repositorio.save(e);
	}

	@Override
	public Empresa delete(Long id) {
		// deleta uma empresa
		Empresa e = repositorio.findById(id);
		if(e!=null) {
			repositorio.delete(e);
		}
		return e;
	}

	@Override
	public Empresa add(Empresa e) {
		//salva uma empresa
		return repositorio.save(e);
	}

}
