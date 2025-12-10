/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.inso_final.CRUD_ALMACENERO.repository;

import com.inso_final.CRUD_ALMACENERO.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author sebas
 */
public interface ProductoRepository extends JpaRepository <Producto, Integer>{
    
}
