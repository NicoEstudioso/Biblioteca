package com.example.bibliotecaduoc.service;
//3CONECTA LA SALIDA DE INTERNET CON EL REPOSITORY
//CAPA DEL NEGOCIO:REGLAS DE LA EMPRESA

import com.example.bibliotecaduoc.model.Prestamo;


import com.example.bibliotecaduoc.repository.PrestamoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PrestamoService {

    @Autowired
    private PrestamoRepository prestamoRepository;

    public List<Prestamo> getPrestamos(){
        return prestamoRepository.obtenerListaPrestamo();
    }

    public Prestamo savePrestamo(Prestamo prestamo){
        return prestamoRepository.guardar(prestamo);
    }

    public Prestamo getPrestamo(int id){
        return prestamoRepository.buscarPorIdPrestamo(id);
    }

    public Prestamo updatePrestamo(Prestamo prestamo){
        return prestamoRepository.actualizar(prestamo);
    }

    public String deletePrestamo(int idPrestamo){
        prestamoRepository.eliminar(idPrestamo);
        return "Prestamo eliminado";
    }
}
