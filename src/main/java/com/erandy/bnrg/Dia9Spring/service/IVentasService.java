/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erandy.bnrg.Dia9Spring.service;

import com.erandy.bnrg.Dia9Spring.entity.ProductoEntity;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author w10
 */
@FeignClient(name = "producto", url = "http://localhost:8081/api")
public interface IVentasService {

    @GetMapping("/productos")
    @Operation(summary = "Obtiene lista de Productos")
    //@RequestMapping(method = RequestMethod.GET, value = "/productos")
    List<ProductoEntity> getProductos();

}
