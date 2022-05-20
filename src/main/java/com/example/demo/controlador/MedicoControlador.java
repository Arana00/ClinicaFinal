package com.example.demo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Medico;
import com.example.demo.service.IMedicoServicio;

@RestController
@RequestMapping("/medicos")
public class MedicoControlador {
	
	@Autowired
	private IMedicoServicio servicio;
	
	@GetMapping
	public List<Medico> Listar() throws Exception{
		return servicio.listar();
	}
	
	@GetMapping("{id}")
	public Medico listarPorId(@PathVariable("id") Integer id) throws Exception{
		return servicio.listarPorId(id);
	}
	
	@PostMapping
	public Medico registrar(@RequestBody Medico p) throws Exception{
		return servicio.registrar(p);
	}
	
	@PutMapping
	public Medico modificar(@RequestBody Medico p) throws Exception{
		return servicio.modificar(p);
	}
	
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable("id") Integer id) throws Exception{
		 servicio.eliminar(id);
	}
	

}
