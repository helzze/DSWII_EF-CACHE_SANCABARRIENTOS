package dsw.ef.p3.sanca.DSWII_EF_CACHE_SancaBarrientos.service;

import dsw.ef.p3.sanca.DSWII_EF_CACHE_SancaBarrientos.model.Venta;

import java.util.List;

public interface IVentaService {
    List<Venta> obtenerVentasPorMetodoPago(String metodoPago);
    Venta registrarVenta(Venta venta);
    Venta actualizarVenta(Venta venta);
    void eliminarVenta(Integer id);
    void limpiarCache();
}

