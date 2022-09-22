package com.quipux.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Getter
@Setter
@Entity
@Table
public class Usuario {

    @Id
    private int id;
    private String nombre;
    private String clave;

}
