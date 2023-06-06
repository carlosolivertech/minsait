package minsait.infraestrutura.mapper;

import minsait.dominio.model.CaixaModel;
import minsait.infraestrutura.entity.CaixaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CaixaEntityMapper {

    CaixaEntityMapper INSTANCE = Mappers.getMapper(CaixaEntityMapper.class);

    CaixaModel toModel(CaixaEntity source);

    CaixaEntity toEntity(CaixaModel source);
}
