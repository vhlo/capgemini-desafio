import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class questao3Test {

    @Test
    void validaAnagrama(){
        int quantidade = questao3.validaAnagrama("ovo");
        Assertions.assertEquals(quantidade, 2, "Validando quantidade de anagramas");
    }
}