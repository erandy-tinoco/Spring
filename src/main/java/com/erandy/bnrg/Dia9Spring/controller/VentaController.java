/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erandy.bnrg.Dia9Spring.controller;

import com.erandy.bnrg.Dia9Spring.entity.ProductoEntity;
import com.erandy.bnrg.Dia9Spring.service.IVentasService;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author w10
 */
@RestController
@RequestMapping(path = "/ventas")
public class VentaController {

    @Autowired
    private IVentasService ventaService; 

    @Operation(summary = "Obtiene lista de Productos")
    //@GetMapping("/productos")
    @RequestMapping(method = RequestMethod.GET, value = "/productos")
    public ResponseEntity<List<ProductoEntity>> getProductos() {
        return new ResponseEntity<>(ventaService.getProductos(), HttpStatus.OK);
    }

}
