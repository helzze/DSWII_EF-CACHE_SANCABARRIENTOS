package dsw.ef.p3.sanca.DSWII_EF_CACHE_SancaBarrientos.service.impl;

import dsw.ef.p3.sanca.DSWII_EF_CACHE_SancaBarrientos.model.Vehiculo;
import dsw.ef.p3.sanca.DSWII_EF_CACHE_SancaBarrientos.repository.VehiculoRepository;
import dsw.ef.p3.sanca.DSWII_EF_CACHE_SancaBarrientos.service.IVehiculoService;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class VehiculoService implements IVehiculoService {

    private final VehiculoRepository vehiculoRepository;

    @Cacheable(value = "vehiculosAnio", key = "#anio")
    @Override
    public List<Vehiculo> obtenerVehiculosPorAnio(int anio) {
        return vehiculoRepository.findByAnio(anio);
    }

    @CacheEvict(value = "vehiculosAnio", allEntries = true)
    @Override
    public Vehiculo registrarVehiculo(Vehiculo vehiculo) {
        return vehiculoRepository.save(vehiculo);
    }

    @CachePut(value = "vehiculosAnio", key = "#vehiculo.idvehiculo")
    @Override
    public Vehiculo actualizarVehiculo(Vehiculo vehiculo) {
        return vehiculoRepository.save(vehiculo);
    }

    @CacheEvict(value = "vehiculosAnio", allEntries = true)
    @Override
    public void eliminarVehiculo(Integer id) {
        vehiculoRepository.deleteById(id);
    }

    @CacheEvict(value = "vehiculosAnio", allEntries = true)
    @Override
    public void limpiarCache() {
    }
}