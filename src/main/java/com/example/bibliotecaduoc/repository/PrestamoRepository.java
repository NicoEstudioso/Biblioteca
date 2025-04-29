package com.example.bibliotecaduoc.repository;

import com.example.bibliotecaduoc.model.Prestamo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.ArrayList;

public class PrestamoRepository {

    private List<Prestamo> listaPrestamo = new ArrayList<>();

    public List<Prestamo> obtenerListaPrestamo() {
        return listaPrestamo;

    }

    public Prestamo buscarPorIdPrestamo(int idPrestamo){
        for (Prestamo prestamo : listaPrestamo) {
            if(prestamo.getIdPrestamo() == idPrestamo){
                return prestamo;
            }
        }
        return null;
    }

    public Prestamo buscarPorIdLibro(int libroid){
        for (Prestamo prestamo : listaPrestamo) {
            if(prestamo.getLibroid() == (libroid)){
                return prestamo;
            }
        }
        return null;
    }

    public Prestamo guardar(Prestamo prestamo){
        listaPrestamo.add(prestamo);
        return prestamo;
    }

    public Prestamo actualizar(Prestamo prestamo){
        int idPrestamo =0;
        int idPosicion = 0;

        for (int i = 0; i < listaPrestamo.size(); i++) {
            if (listaPrestamo.get(i).getIdPrestamo() == prestamo.getIdPrestamo()){
                idPrestamo = prestamo.getIdPrestamo();
                idPosicion = i;
            }
        }

        Prestamo prestamoNuevo = new Prestamo();
        prestamoNuevo.setIdPrestamo(idPrestamo);
        prestamoNuevo.setLibroid(prestamo.getLibroid());
        prestamoNuevo.setRunSolicitante(prestamo.getRunSolicitante());
        prestamoNuevo.setFechaEntrega(prestamo.getFechaEntrega());
        prestamoNuevo.setCantidadDias(prestamo.getCantidadDias());
        prestamoNuevo.setMultas(prestamo.getMultas());

        listaPrestamo.set(idPosicion, prestamoNuevo);
        return prestamoNuevo;

    }

    public void eliminar(int id){
        Prestamo prestamo = buscarPorIdPrestamo(id);
        listaPrestamo.remove(prestamo);
    }

}
