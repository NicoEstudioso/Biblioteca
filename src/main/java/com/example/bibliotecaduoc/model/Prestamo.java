package com.example.bibliotecaduoc.model;



import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Prestamo {
    private int idPrestamo;
    private int libroid;
    private String runSolicitante;
    private Date fechaSolicitud = new Date();
    private Date fechaEntrega = new Date();
    private int cantidadDias;
    private int multas;
}