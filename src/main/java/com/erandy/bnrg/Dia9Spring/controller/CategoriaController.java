/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erandy.bnrg.Dia9Spring.controller;

import com.erandy.bnrg.Dia9Spring.entity.CategoriaEntity;
import com.erandy.bnrg.Dia9Spring.service.CategoriaService;
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
//@Api(value = "categoria", description = "The API", tags = "OperationsCategoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @Operation(summary = "Obtiene la lista de categorias")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Lista de Categorias",
                content = {
                    @Content(mediaType = "application/json",
                            schema = @Schema(implementation = CategoriaEntity.class))}),
        @ApiResponse(responseCode = "400", description = "Parametro Invalido",
                content = @Content),
        @ApiResponse(responseCode = "404", description = "Categoria no encontrada",
                content = @Content)})
    @GetMapping("/categorias")
    public List<CategoriaEntity> getCategorias() {
        return categoriaService.getlistCategoria();
    }

    @Operation(summary = "Obtiene Categoria por Id")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Obtiene Categoria",
                content = {
                    @Content(mediaType = "application/json",
                            schema = @Schema(implementation = CategoriaEntity.class))}),
        @ApiResponse(responseCode = "400", description = "Parametro Invalido",
                content = @Content),
        @ApiResponse(responseCode = "404", description = "Categoria no encontrada",
                content = @Content)})
    @GetMapping("/categorias/{id}")
    public CategoriaEntity getById(@PathVariable("id") int id) {
        return categoriaService.getByCategoriaId(id);
    }

    @Operation(summary = "Gnera Categoria nueva")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Genera Categoria",
                content = {
                    @Content(mediaType = "application/json",
                            schema = @Schema(implementation = CategoriaEntity.class))}),
        @ApiResponse(responseCode = "400", description = "Parametro Invalido",
                content = @Content),
        @ApiResponse(responseCode = "404", description = "Categoria no generada",
                content = @Content)})
    @PostMapping("/categorias")
    public CategoriaEntity saveCategoria(@RequestBody CategoriaEntity categoriaEntity) {
        return categoriaService.addCategoria(categoriaEntity);
    }

    @Operation(summary = "Elimina Categoria por Id")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Elimina Categoria",
                content = {
                    @Content(mediaType = "application/json",
                            schema = @Schema(implementation = CategoriaEntity.class))}),
        @ApiResponse(responseCode = "400", description = "Parametro Invalido",
                content = @Content),
        @ApiResponse(responseCode = "404", description = "Categoria no eliminada",
                content = @Content)})
    @DeleteMapping("/categorias/{id}")
    public void eliminarCategoria(@PathVariable("id") int id) {
        CategoriaEntity categoria = new CategoriaEntity();
        categoria.setCategoriaId(id);
        categoriaService.eliminaCategoria(categoria);
    }

    @Operation(summary = "Actualiza Categoria por Id")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Actualiza Categoria",
                content = {
                    @Content(mediaType = "application/json",
                            schema = @Schema(implementation = CategoriaEntity.class))}),
        @ApiResponse(responseCode = "400", description = "Parametro Invalido",
                content = @Content),
        @ApiResponse(responseCode = "404", description = "Categoria no actualizada",
                content = @Content)})
    @PutMapping("/categorias/{id}")
    public CategoriaEntity actualizarCategoria(@PathVariable("id") int id,
            @RequestBody CategoriaEntity categoria) {
        categoria.setCategoriaId(id);
        return categoriaService.actualizaCategoria(categoria);
    }
}
