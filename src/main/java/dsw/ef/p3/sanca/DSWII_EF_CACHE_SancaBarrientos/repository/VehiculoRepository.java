package dsw.ef.p3.sanca.DSWII_EF_CACHE_SancaBarrientos.repository;

import dsw.ef.p3.sanca.DSWII_EF_CACHE_SancaBarrientos.model.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehiculoRepository extends JpaRepository<Vehiculo, Integer> {
    List<Vehiculo> findByAnio(int anio);
}