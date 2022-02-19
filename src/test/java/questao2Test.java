import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class questao2Test {

    @Test
    void validaTamanho() {
        boolean validacao = questao2.validaTamanho("Vic@bb3");
        Assertions.assertTrue(validacao);
    }

    @Test
    void validaTamanhoFalse(){
        boolean validacao = questao2.validaTamanho("12345");
        Assertions.assertFalse(validacao);
    }

    @Test
    void umDigitoFalse(){
        boolean validacao = questao2.umDigito("");
        Assertions.assertFalse(validacao);
    }

    @Test
    void umDigito() {
        boolean validacao = questao2.umDigito("ViCt@1");
        Assertions.assertTrue(validacao);
    }

    @Test
    void letraMaiFalse(){
        boolean validacao = questao2.letraMai("abcdfeg");
        Assertions.assertFalse(validacao);
    }

    @Test
    void letraMai() {
        boolean validacao = questao2.letraMai("vIcT1z");
        Assertions.assertTrue(validacao);
    }

    @Test
    void letraMinFalse(){
        boolean validacao = questao2.letraMin("AAAAAAAAA");
        Assertions.assertFalse(validacao);
    }

    @Test
    void letraMin() {
        boolean validacao = questao2.letraMin("C@ib2z");
        Assertions.assertTrue(validacao);
    }

    @Test
    void carEspFalse(){
        boolean validacao = questao2.carEsp("Tj1lzzz");
        Assertions.assertFalse(validacao);
    }

    @Test
    void carEsp() {
        boolean validacao = questao2.carEsp("C@ib2z");
        Assertions.assertTrue(validacao);
    }
}