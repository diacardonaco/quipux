package com.quipux.model;

import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "playlist")
public class PlayList {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "id_playlist")
    private Long id;

    @Column(name = "nombre")
    private String  nombre;

    @Column(name = "descripcion")
    private String  descripcion;

    @ManyToMany
    private Set<Cancion> canciones;
}





