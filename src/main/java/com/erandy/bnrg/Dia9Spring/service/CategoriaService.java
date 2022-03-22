/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erandy.bnrg.Dia9Spring.service;

import com.erandy.bnrg.Dia9Spring.entity.CategoriaEntity;
import com.erandy.bnrg.Dia9Spring.repository.CategoriaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author w10
 */
@Service
public class CategoriaService implements ICategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public List<CategoriaEntity> getlistCategoria() {
        return categoriaRepository.findAll();
    }

    //GET Consulta todas la cuenta por id 
    @Override
    public CategoriaEntity getByCategoriaId(int categoriaId) {
        return categoriaRepository.findById(categoriaId);
    }

    @Override
    public CategoriaEntity addCategoria(CategoriaEntity categoriaEntity) {
        return categoriaRepository.save(categoriaEntity);
    }

    @Override
    public void eliminaCategoria(CategoriaEntity categoriaEntity) {
        categoriaRepository.delete(categoriaEntity);
    }

    @Override
    public CategoriaEntity actualizaCategoria(CategoriaEntity categoriaEntity) {
        return categoriaRepository.save(categoriaEntity);
    }
}
