package minsait.infraestrutura.repositorio;

import minsait.infraestrutura.entity.CaixaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaixaRepository extends CrudRepository<CaixaEntity, Long> {
}
