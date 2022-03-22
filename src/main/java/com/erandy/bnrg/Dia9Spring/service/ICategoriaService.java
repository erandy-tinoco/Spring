/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erandy.bnrg.Dia9Spring.service;

import com.erandy.bnrg.Dia9Spring.entity.CategoriaEntity;
import java.util.List;

/**
 *
 * @author w10
 */
public interface ICategoriaService {

    /**
     * Obtiene lista de categorias
     *
     * @return
     */
    public List<CategoriaEntity> getlistCategoria();
    
    /**
     * Obtiene lista por CategoriaId
     *
     * @param categoriaId
     * @return
     */
    public CategoriaEntity getByCategoriaId(int categoriaId);

    /**
     * Agrega Categoria
     *
     * @param categoriaEntity
     * @return
     */
    public CategoriaEntity addCategoria(CategoriaEntity categoriaEntity);

    /**
     * Elimina Categoria por id
     *
     * @param categoriaEntity
     */
    public void eliminaCategoria(CategoriaEntity categoriaEntity);

    /**
     * Actualiza categoria
     *
     * @param categoriaEntity
     * @return
     */
    public CategoriaEntity actualizaCategoria(CategoriaEntity categoriaEntity);

}
