package dsw.ef.p3.sanca.DSWII_EF_CACHE_SancaBarrientos.service;

import dsw.ef.p3.sanca.DSWII_EF_CACHE_SancaBarrientos.model.Vehiculo;

import java.util.List;

public interface IVehiculoService {
    List<Vehiculo> obtenerVehiculosPorAnio(int anio);
    Vehiculo registrarVehiculo(Vehiculo vehiculo);
    Vehiculo actualizarVehiculo(Vehiculo vehiculo);
    void eliminarVehiculo(Integer id);
    void limpiarCache();
}

