package com.rsr.curso.productos.modelo.service;

import java.util.List;

import com.rsr.curso.productos.modelo.Item;

public interface ItemService {
	public List <Item> findAll();
	public Item findById(Long id,Integer catidad);
}
