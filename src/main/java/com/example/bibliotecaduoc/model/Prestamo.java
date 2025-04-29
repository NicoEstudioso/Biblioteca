package com.example.bibliotecaduoc.model;
import com.example.bibliotecaduoc.model.Libro;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Prestamo {
    private int idPrestamo;
    private Libro id;
    private String runSolicitante;
    private int fechaSolicitud;
    private int fechaEntrega;
    private int cantidadDias;
    private int multas;
}
