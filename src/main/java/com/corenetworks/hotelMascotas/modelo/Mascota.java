package com.corenetworks.hotelMascotas.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name= "mascotas")

public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMascota;
    @Column(length = 60,nullable = false)
    private String nombre;
    @Column(length = 50,nullable = false)
    private String raza;
    @Column(nullable = false)
    private int edad;
    @Column(length = 30,nullable = false)
    private String tamano;
    @Column (length = 30,nullable = false)
    private String tipoMascota;
    @ManyToOne
    @JoinColumn(name="id_cliente",nullable = false,foreignKey = @ForeignKey(name="FK_mascotas_clientes"))

    private Cliente cliente;
}
