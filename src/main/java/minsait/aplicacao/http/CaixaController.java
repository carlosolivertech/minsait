package minsait.aplicacao.http;

import minsait.aplicacao.http.dto.CaixaDto;
import minsait.aplicacao.http.mapper.CaixaMapper;
import minsait.dominio.service.CaixaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("caixa")
public class CaixaController {

    @Autowired
    private CaixaService service;

    CaixaMapper mapper = CaixaMapper.INSTANCE;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public CaixaDto obterSaldoDiarioConsolidado(@PathVariable(value = "id")  Long id) throws Exception {
        return mapper.toCaixaDto(service.obterSaldoConsolidado(id));
    }
}
