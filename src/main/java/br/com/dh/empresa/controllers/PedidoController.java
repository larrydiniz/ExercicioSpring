package br.com.dh.empresa.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dh.empresa.model.entities.Pedido;
import br.com.dh.empresa.model.repositories.PedidoRepository;

@RestController
@RequestMapping("pedido")
public class PedidoController {
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@GetMapping
	public Iterable<Pedido> getPedidos(){ 
		return pedidoRepository.findAll();
	}
	
	@GetMapping("/{id}") 
	public Optional <Pedido> getById(@PathVariable String id) { 
		return pedidoRepository.findById(id); 
	}
	
	@PostMapping("/novo")
	public Pedido addPedido(@RequestBody Pedido pedido) {
		pedidoRepository.save(pedido);
		return pedido;
	}
	
	@PutMapping("status/{nota}")
	public Pedido updateStatusPedido(@PathVariable String nota, @RequestBody Pedido dadosPedido) throws Exception{
		
		Pedido pedidoDB = pedidoRepository.findById(nota)
				.orElseThrow(() -> new IllegalAccessException());
		
		if(!dadosPedido.getStatus_pedido().isEmpty())pedidoDB.setStatus_pedido(dadosPedido.getStatus_pedido());
			
		pedidoRepository.save(pedidoDB); 
		
		return pedidoDB;
	}
}
