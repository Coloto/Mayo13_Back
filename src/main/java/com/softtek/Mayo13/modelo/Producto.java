package com.softtek.Mayo13.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_producto;

    @Column(length = 30, nullable = false)
    private String nombre_producto;

    @Column(nullable = false)
    private int stock;

    @Column(nullable = false)
    private double precio_unitario;
}