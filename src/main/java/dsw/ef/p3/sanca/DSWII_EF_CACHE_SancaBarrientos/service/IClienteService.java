package dsw.ef.p3.sanca.DSWII_EF_CACHE_SancaBarrientos.service;

import dsw.ef.p3.sanca.DSWII_EF_CACHE_SancaBarrientos.model.Cliente;

public interface IClienteService {
    Cliente obtenerClientePorId(Integer id);
    Cliente registrarCliente(Cliente cliente);
    Cliente actualizarCliente(Cliente cliente);
    void eliminarCliente(Integer id);
    void limpiarCache();
}