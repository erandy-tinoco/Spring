/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erandy.bnrg.Dia9Spring.service;

import com.erandy.bnrg.Dia9Spring.entity.ProductoEntity;
import com.erandy.bnrg.Dia9Spring.repository.ProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author w10
 */
@Service
public class VentaService implements IVentasService{
    

    @Autowired
    private ProductoRepository productoRepository;

    public List<ProductoEntity> getProductos() {
        return productoRepository.findAll();
    }
    
}
