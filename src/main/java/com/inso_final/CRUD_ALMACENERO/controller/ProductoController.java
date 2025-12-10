/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inso_final.CRUD_ALMACENERO.controller;

import com.inso_final.CRUD_ALMACENERO.model.Producto;
import com.inso_final.CRUD_ALMACENERO.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/productos")
public class ProductoController {
    
    @Autowired
    private ProductoService productoService;
    
    @GetMapping
    public String listarProductos(Model model) {
        model.addAttribute("producto", productoService.listarProductos());
        return "producto-list";
    }
    
    @GetMapping("/nuevo")
    public String showFormNewProduct (Model model) {
        model.addAttribute("producto", new Producto());
        return "producto-form";
    }
    
    @PostMapping
    public String updateProduct(Producto producto) {
        productoService.update(producto);
        return "redirect:/productos";
    }
    
    @GetMapping("/editar/{id}")
    public String showFormNewProduct(@PathVariable Integer id, Model model){
        model.addAttribute("producto", productoService.searchId(id));
        return "producto-form";
    }
    
    @GetMapping("/detalle/{id}")
    public String detailProduct(@PathVariable Integer id, Model model){
        model.addAttribute("producto", productoService.searchId(id));
        return "producto-detail";
    }

    @GetMapping("/eliminar/{id}")
    public String deleteProduct(@PathVariable Integer id){
        productoService.delete(id);
        return "redirect:/productos";
    }
}