package com.example.bibliotecaduoc.controller;
//4 DISPONIBILIZAR LOS METODOS HACIA AFUERA
import com.example.bibliotecaduoc.model.Prestamo;
import com.example.bibliotecaduoc.service.PrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/prestamos")

public class PrestamoControlador {

    @Autowired
    PrestamoService prestamoService;

    @GetMapping
    public List<Prestamo> listarPrestamos(){
        return prestamoService.getPrestamos();
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Prestamo agregarPrestamo(@RequestBody Prestamo prestamo){
        return prestamoService.savePrestamo(prestamo);
    }

    @GetMapping("{id}")
    public Prestamo buscarPrestamo(@PathVariable int id){
        return prestamoService.getPrestamo(id);
    }

    @PutMapping("{id}")
    public Prestamo actualizarLibro(@PathVariable int id, @RequestBody Prestamo prestamo){
        return prestamoService.updatePrestamo(prestamo);
    }
    @DeleteMapping("{id}")
    public String eliminarPrestamo(@PathVariable int id){
        return prestamoService.deletePrestamo(id);
    }
}
