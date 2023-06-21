package org.example;

import junit.framework.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CargaTeste {

    private CargaPage CargaPag;

    @BeforeEach
    public void BeforEach(){ CargaPag = new CargaPage();}

    @AfterEach
    public void afterEach() {
        CargaPag.fechar();
    }

    @Test
    public void verificarSePaginaAcessadaCoreta(){
        Assert.assertTrue(CargaPag.isPaginaCorreta());
    }

    @Test
    public void verificaContemTextoTituloJobs(){
       Assert.assertTrue(CargaPag.verificaContemTextoTitulo());
    }
    @Test
    public  void executarPesquisaEngenheiroDados(){
        CargaPag.preencherPesquisa("PESSOA ENGENHEIRA DE DADOS");
        CargaPag.executarPesquisa();
        Assert.assertTrue(CargaPag.verificaSePesquisouPaginaCorreta("PESSOA ENGENHEIRA DE DADOS - HÍBRIDO"));
    }

}
