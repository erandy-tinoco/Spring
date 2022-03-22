/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erandy.bnrg.Dia9Spring.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author w10
 */
@Data
@Entity
@Table(name = "producto")
public class ProductoEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "producto_id_producto_seq")
    @SequenceGenerator(name = "producto_id_producto_seq", sequenceName = "producto_id_producto_seq", allocationSize = 1)
    @Column(name = "id_producto")
    private Integer productoId;

    @Column(name = "producto_desc")
    private String productoDesc;

}
