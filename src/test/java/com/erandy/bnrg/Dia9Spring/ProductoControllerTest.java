/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erandy.bnrg.Dia9Spring;

import com.erandy.bnrg.Dia9Spring.controller.ProductoController;
import com.erandy.bnrg.Dia9Spring.entity.ProductoEntity;
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
public class ProductoControllerTest {

    @Autowired
    ProductoController productoController;

    @Test
    public void testGetAllProductos() {
        List<ProductoEntity> productos = productoController.getProductos();
        assertThat(productos).size().isGreaterThan(0);
        System.out.println("okkkk");
    }

    @Test
    public void testGetProductos() {
        int id = 5;
        ProductoEntity productos = productoController.getById(id);
        assertNotNull(productos.getProductoId().toString());
        System.out.println("okas");
    }

    public void testSaveProducto() {
        int id = 10;
        ProductoEntity productos = new ProductoEntity();
        productos.setProductoId(id);
        productos.setProductoDesc("Multi-Familiar");
        productoController.saveProducto(productos);
        assertNotNull(productos.getProductoId().toString());
    }

    public void testEliminaProducto() {
        int id = 5;
        productoController.eliminarProducto(id);
        assertEquals(Optional.empty(), productoController.getById(id));
    }

    public void testActualizaProducto() {
        int id = 6;
        ProductoEntity productos = new ProductoEntity();
        productos.setProductoId(id);
        productos.setProductoDesc("Cofinavit");
        productoController.saveProducto(productos);
        assertNotNull(productos.getProductoId().toString());
    }
}
