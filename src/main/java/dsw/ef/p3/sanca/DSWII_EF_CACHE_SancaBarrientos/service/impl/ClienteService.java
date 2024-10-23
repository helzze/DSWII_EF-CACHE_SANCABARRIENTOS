package dsw.ef.p3.sanca.DSWII_EF_CACHE_SancaBarrientos.service.impl;

import dsw.ef.p3.sanca.DSWII_EF_CACHE_SancaBarrientos.model.Cliente;
import dsw.ef.p3.sanca.DSWII_EF_CACHE_SancaBarrientos.repository.ClienteRepository;
import dsw.ef.p3.sanca.DSWII_EF_CACHE_SancaBarrientos.service.IClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ClienteService implements IClienteService {

    private final ClienteRepository clienteRepository;

    @Cacheable(value = "clientes", key = "#id")
    @Override
    public Cliente obtenerClientePorId(Integer id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @CacheEvict(value = "clientes", allEntries = true)
    @Override
    public Cliente registrarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @CachePut(value = "clientes", key = "#cliente.id")
    @Override
    public Cliente actualizarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @CacheEvict(value = "clientes", allEntries = true)
    @Override
    public void eliminarCliente(Integer id) {
        clienteRepository.deleteById(id);
    }

    @CacheEvict(value = "clientes", allEntries = true)
    @Override
    public void limpiarCache() {
    }
}
