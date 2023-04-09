package com.basedatos.basededatos.models;

import jakarta.persistence.*;

@Entity
@Table(schema = "fabricante")
public class FabricanteModel {
    @Id
    @Column(name = "id",updatable = false, nullable = false,  unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;
}
