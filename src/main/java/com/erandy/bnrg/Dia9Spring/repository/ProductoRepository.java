/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erandy.bnrg.Dia9Spring.repository;

import com.erandy.bnrg.Dia9Spring.entity.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author w10
 */
@Repository
public interface ProductoRepository extends JpaRepository<ProductoEntity, Integer> {
     public ProductoEntity findById(int id);
}
