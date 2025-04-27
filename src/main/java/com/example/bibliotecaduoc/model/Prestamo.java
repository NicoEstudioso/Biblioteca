package com.example.bibliotecaduoc.model;
import com.example.bibliotecaduoc.model.Libro;

import java.util.Date;

public class Prestamo {
    public int idPrestamo;
    public Libro id;
    public String runSolicitante;
    public Date fechaSolicitud;
    public Date fechaEntrega;
    public int cantidadDias;
    public int multas;
}
