package dsw.ef.p3.sanca.DSWII_EF_CACHE_SancaBarrientos.repository;

import dsw.ef.p3.sanca.DSWII_EF_CACHE_SancaBarrientos.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}