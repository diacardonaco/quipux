package com.quipux.model;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "CLIENT")
public class Client {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_cliente")
    @Id
    private long id;
    private String typeIdentification;
    private String identification;
    private String name;
    private String city;
    private String address;
    private String phone;

}