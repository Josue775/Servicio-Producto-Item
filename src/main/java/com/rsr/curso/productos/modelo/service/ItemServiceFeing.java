package com.rsr.curso.productos.modelo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.rsr.curso.productos.clientes.ProductoClienteRest;
import com.rsr.curso.productos.modelo.Item;

@Service("serviceFeing")
@Primary
public class ItemServiceFeing implements ItemService{
	@Autowired
	private ProductoClienteRest clienteFeing;
	@Override
	public List<Item> findAll() {
		return clienteFeing.listar()
                .stream()
                .map(p -> new Item(p, 1))
                .collect(Collectors.toList());
	}

	@Override
	public Item findById(Long id, Integer catidad) {
		// TODO Auto-generated method stub
		return new Item(clienteFeing.detalle(id),catidad);
	}

}
