package minsait.infraestrutura.datasource;

import minsait.dominio.exception.CaixaNotFoundException;
import minsait.dominio.model.CaixaModel;
import minsait.dominio.portas.repositorio.CaixaRepositorioPort;
import minsait.infraestrutura.entity.CaixaEntity;
import minsait.infraestrutura.mapper.CaixaEntityMapper;
import minsait.infraestrutura.repositorio.CaixaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public class CaixaDataSourceImpl implements CaixaRepositorioPort {

    @Autowired
    private CaixaRepository repository;

    private CaixaEntityMapper mapper = CaixaEntityMapper.INSTANCE;

    @Override
    public CaixaModel obterSaldoConsolidado(Long id) throws Exception {
       Optional<CaixaEntity> entity = repository.findById(id);

       if(!entity.isPresent()){
           throw new CaixaNotFoundException(id);
       }

       return mapper.toModel(entity.get());
    }
}
