/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erandy.bnrg.Dia9Spring.service;

import com.erandy.bnrg.Dia9Spring.entity.ProductoEntity;
import java.util.List;

/**
 *
 * @author w10
 */
public interface IProductoService {
    
        /**
     * Obtiene lista de categorias
     *
     * @return
     */
    public List<ProductoEntity> getlistProducto();
    
    /**
     * Obtiene lista por ProductoId
     *
     * @param productoId
     * @return
     */
    public ProductoEntity getByProductoId(int productoId);

    /**
     * Agrega producto
     *
     * @param productoEntity
     * @return
     */
    public ProductoEntity addProducto(ProductoEntity productoEntity);

    /**
     * Elimina producto por id
     *
     * @param productoEntity
     */
    public void eliminaProducto(ProductoEntity productoEntity);

    /**
     * Actualiza producto
     *
     * @param productoEntity
     * @return
     */
    public ProductoEntity actualizaProducto(ProductoEntity productoEntity);
    
}
