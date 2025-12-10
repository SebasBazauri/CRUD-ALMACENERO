/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inso_final.CRUD_ALMACENERO.service;

import com.inso_final.CRUD_ALMACENERO.model.Producto;
import com.inso_final.CRUD_ALMACENERO.repository.ProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductoService {
    
    @Autowired
    private ProductoRepository productoRepository;
    
    public List<Producto> listarProductos(){
        return productoRepository.findAll();
    }
    
    public Producto update(Producto producto) {
        return productoRepository.save(producto);
    }
    
    public Producto searchId(Integer id) {
        return productoRepository.findById(id).orElse(null);
    }
    
    public void delete(Integer id){
        productoRepository.deleteById(id);
    }
}
