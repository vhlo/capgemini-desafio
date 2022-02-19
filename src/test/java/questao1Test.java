import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class questao1Test {

    @Test
    void main() {
    }

    @Test
    void validaTriangulo() {
        try{
       questao1.ValidaTriangulo2(6);

        }catch (Exception e ){
            Assertions.fail();
        }

    }
}