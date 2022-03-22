/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erandy.bnrg.Dia9Spring;

import com.erandy.bnrg.Dia9Spring.controller.CategoriaController;
import com.erandy.bnrg.Dia9Spring.entity.CategoriaEntity;
import java.util.List;
import java.util.Optional;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author w10
 */
@SpringBootTest
public class CategoriaControllerTest {

    @Autowired
    CategoriaController categoriaController;

    @Test
    public void testGetAllCategoria() {
        List<CategoriaEntity> categorias = categoriaController.getCategorias();
        assertThat(categorias).size().isGreaterThan(0);
        System.out.println("okkkk");
    }

    @Test
    public void testGetCategoria() {
        int id = 5;
        CategoriaEntity categorias = categoriaController.getById(id);
        assertNotNull(categorias.getCategoriaId().toString());
        System.out.println("okas");
    }
    
    public void testSaveCategoria(){
        int id = 10;
        CategoriaEntity categorias = new CategoriaEntity();
        categorias.setCategoriaId(id);
        categorias.setCategoriaDesc("Multi-Familiar");
        categoriaController.saveCategoria(categorias);
        assertNotNull(categorias.getCategoriaId().toString());
    }
    
    public void testEliminaCategoria(){
        int id = 5;
        categoriaController.eliminarCategoria(id);
        assertEquals(Optional.empty(), categoriaController.getById(id));
    }
    
     public void testActualizaCategoria(){
        int id = 6;
        CategoriaEntity categorias = new CategoriaEntity();
        categorias.setCategoriaId(id);
        categorias.setCategoriaDesc("Multi-Familiares");
        categoriaController.saveCategoria(categorias);
        assertNotNull(categorias.getCategoriaId().toString());
    }

}
