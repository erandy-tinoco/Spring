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
public class ProductoService implements IProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<ProductoEntity> getlistProducto() {
        return productoRepository.findAll();
    }

    //GET Consulta todas la cuenta por id 
    @Override
    public ProductoEntity getByProductoId(int productoId) {
        return productoRepository.findById(productoId);
    }

    @Override
    public ProductoEntity addProducto(ProductoEntity productoEntity) {
        return productoRepository.save(productoEntity);
    }

    @Override
    public void eliminaProducto(ProductoEntity productoEntity) {
        productoRepository.delete(productoEntity);
    }

    @Override
    public ProductoEntity actualizaProducto(ProductoEntity productoEntity) {
        return productoRepository.save(productoEntity);
    }
}
