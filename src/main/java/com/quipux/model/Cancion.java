package com.quipux.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;


@Entity
@Getter
@Setter
@Table(name = "CANCION")
public class Cancion {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "id_cancion")
    private Long id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "artista")
    private String artista;

    @Column(name = "album")
    private String album;

    @Column(name = "anno")
    private String anno;

    @Column(name = "genero")
    private String genero;

    //@JoinColumn(name = "id_playlist")
    @ManyToMany
    Set<PlayList> likedPlayList;

}
