/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erandy.bnrg.Dia9Spring.controller;

import com.erandy.bnrg.Dia9Spring.entity.ProductoEntity;
import com.erandy.bnrg.Dia9Spring.service.ProductoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author w10
 */
@RestController
@RequestMapping(path = "/api")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @Operation(summary = "Obtiene lista de Productos")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Lista de Productos",
                content = {
                    @Content(mediaType = "application/json",
                            schema = @Schema(implementation = ProductoEntity.class))}),
        @ApiResponse(responseCode = "400", description = "Parametro Invalido",
                content = @Content),
        @ApiResponse(responseCode = "404", description = "Sin lista de Productos",
                content = @Content)})
    @GetMapping("/productos")
    public List<ProductoEntity> getProductos() {
        return productoService.getlistProducto();
    }

    @Operation(summary = "Obtiene Producto por Id")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Producto por Id",
                content = {
                    @Content(mediaType = "application/json",
                            schema = @Schema(implementation = ProductoEntity.class))}),
        @ApiResponse(responseCode = "400", description = "Parametro Invalido",
                content = @Content),
        @ApiResponse(responseCode = "404", description = "Producto no encontrado",
                content = @Content)})
    @GetMapping("/productos/{id}")
    public ProductoEntity getById(@PathVariable("id") int id) {
        return productoService.getByProductoId(id);
    }

    @Operation(summary = "Agrega Producto")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Agrega nuevo Producto",
                content = {
                    @Content(mediaType = "application/json",
                            schema = @Schema(implementation = ProductoEntity.class))}),
        @ApiResponse(responseCode = "400", description = "Parametro Invalido",
                content = @Content),
        @ApiResponse(responseCode = "404", description = "Producto no agregado",
                content = @Content)})
    @PostMapping("/productos")
    public ProductoEntity saveProducto(@RequestBody ProductoEntity productoEntity) {
        return productoService.addProducto(productoEntity);
    }

    @Operation(summary = "Elimina Producto por Id")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Elimina Producto por Id",
                content = {
                    @Content(mediaType = "application/json",
                            schema = @Schema(implementation = ProductoEntity.class))}),
        @ApiResponse(responseCode = "400", description = "Parametro Invalido",
                content = @Content),
        @ApiResponse(responseCode = "404", description = "Producto no eliminado",
                content = @Content)})
    @DeleteMapping("/productos/{id}")
    public void eliminarProducto(@PathVariable("id") int id) {
        ProductoEntity producto = new ProductoEntity();
        producto.setProductoId(id);
        productoService.eliminaProducto(producto);
    }

    @Operation(summary = "Actualiza Producto por Id")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Actualiza Producto por Id",
                content = {
                    @Content(mediaType = "application/json",
                            schema = @Schema(implementation = ProductoEntity.class))}),
        @ApiResponse(responseCode = "400", description = "Parametro Invalido",
                content = @Content),
        @ApiResponse(responseCode = "404", description = "Producto no actualizado",
                content = @Content)})
    @PutMapping("/productos/{id}")
    public ProductoEntity actualizaProducto(@PathVariable("id") int id,
            @RequestBody ProductoEntity producto) {
        producto.setProductoId(id);
        return productoService.actualizaProducto(producto);
    }

}
