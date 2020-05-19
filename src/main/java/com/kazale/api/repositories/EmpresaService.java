package com.kazale.api.repositories;

import java.util.List;
import com.kazale.api.model.Empresa;

public interface EmpresaService {

List<Empresa>listar();
	
	Empresa listarId(Long id);
	Empresa add(Empresa e);
	Empresa edit(Empresa e);
	Empresa delete(Long id);
}
