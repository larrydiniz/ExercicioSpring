package br.com.dh.empresa.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dh.empresa.model.entities.Cliente;
import br.com.dh.empresa.model.repositories.ClienteRepository;

@RestController
@RequestMapping("cliente")
public class ClienteController {
	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping()
	public Iterable<Cliente> getClientes(){ 
		return clienteRepository.findAll();
	}
	
	@GetMapping("/{id}") 
	public Optional <Cliente> getById(@PathVariable int id) { 
		return clienteRepository.findById(id); 
	}
	
	@PostMapping("/adicionar")
	public Cliente addCliente(@RequestBody Cliente cliente) {
		clienteRepository.save(cliente);
		return cliente;
	}
}
