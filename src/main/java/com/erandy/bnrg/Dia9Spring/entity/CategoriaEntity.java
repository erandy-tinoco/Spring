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
@Table(name = "categoria")
public class CategoriaEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "categoria_id_categoria_seq")
    @SequenceGenerator(name = "categoria_id_categoria_seq",
            sequenceName = "categoria_id_categoria_seq", allocationSize = 1)
    @Column(name = "id_categoria")
    private Integer categoriaId;

    @Column(name = "categoria_desc")
    private String categoriaDesc;
}
