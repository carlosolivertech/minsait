package minsait.aplicacao.http.mapper;

import minsait.aplicacao.http.dto.CaixaDto;
import minsait.dominio.model.CaixaModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CaixaMapper {

    CaixaMapper INSTANCE = Mappers.getMapper(CaixaMapper.class);

    @Mapping(target = "saldoDiario" , source = "saldo")
    CaixaDto toCaixaDto(CaixaModel source);
}
