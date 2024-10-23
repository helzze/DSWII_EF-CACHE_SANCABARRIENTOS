package dsw.ef.p3.sanca.DSWII_EF_CACHE_SancaBarrientos.service.impl;

import dsw.ef.p3.sanca.DSWII_EF_CACHE_SancaBarrientos.model.Venta;
import dsw.ef.p3.sanca.DSWII_EF_CACHE_SancaBarrientos.repository.VentaRepository;
import dsw.ef.p3.sanca.DSWII_EF_CACHE_SancaBarrientos.service.IVentaService;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class VentaService implements IVentaService {

    private final VentaRepository ventaRepository;

    @Cacheable(value = "ventasMetodoPago", key = "#metodoPago")
    @Override
    public List<Venta> obtenerVentasPorMetodoPago(String metodoPago) {
        return ventaRepository.findByMetodoPago(metodoPago);
    }

    @CacheEvict(value = "ventasMetodoPago", allEntries = true)
    @Override
    public Venta registrarVenta(Venta venta) {
        return ventaRepository.save(venta);
    }

    @CachePut(value = "ventasMetodoPago", key = "#venta.id")
    @Override
    public Venta actualizarVenta(Venta venta) {
        return ventaRepository.save(venta);
    }

    @CacheEvict(value = "ventasMetodoPago", allEntries = true)
    @Override
    public void eliminarVenta(Integer id) {
        ventaRepository.deleteById(id);
    }

    @CacheEvict(value = "ventasMetodoPago", allEntries = true)
    @Override
    public void limpiarCache() {
    }
}