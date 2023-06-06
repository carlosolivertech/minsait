package minsait.service;

import minsait.dominio.model.CaixaModel;
import minsait.dominio.service.CaixaService;
import minsait.infraestrutura.datasource.CaixaDataSourceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@ContextConfiguration(classes = {CaixaService.class})
@RunWith(SpringRunner.class)
public class CaixaServiceTest {

    @Autowired
    private CaixaService service;

    @MockBean
    private CaixaDataSourceImpl caixaDataSourceImpl;

    CaixaModel model = null;

    @Before
    public void setUp() {
        model = new CaixaModel();
        model.setDebito(300L);
        model.setCredito(500l);
        model.setDocumento("111111111111111");
        model.setDescricao("Cafe Roma");
    }

    @Test
    public void whenObterSaldoConsolidado_thenCaixaSucesso() throws Exception {
        Mockito.when(caixaDataSourceImpl.obterSaldoConsolidado(Mockito.anyLong())).thenReturn(model);

        CaixaModel model = service.obterSaldoConsolidado(Mockito.anyLong());

        Assert.assertNotNull(model);

        Assert.assertEquals(model.getCredito().longValue(),500L);

        Assert.assertEquals(model.getDebito().longValue(),300L);

        Assert.assertEquals(model.getDescricao(),"Cafe Roma");

        Assert.assertEquals(model.getDocumento(),"111111111111111");
    }


}
