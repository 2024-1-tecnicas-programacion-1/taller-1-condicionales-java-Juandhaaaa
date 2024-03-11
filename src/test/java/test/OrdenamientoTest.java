package test;

import ejercicios.Ordenamiento;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author danielsanchez
 */
public class OrdenamientoTest {
    @Test
    public void testNo() {
        String valorEsperado = "0 1 6 7";
        String valorActual = Ordenamiento.evaluar(7, 0, 6, 1);
        assertEquals(valorEsperado, valorActual);
    }
         // TODO: Agrega tus otros casos de prueba aquí
    
    @Test
    public void testOrdenarNegativos() {
        String valorEsperado = "-5 -3 -2 0";
        String valorActual = Ordenamiento.evaluar(-2, -5, 0, -3);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void testOrdenarRepetidos() {
        String valorEsperado = "2 2 2 3";
        String valorActual = Ordenamiento.evaluar(2, 3, 2, 2);
        assertEquals(valorEsperado, valorActual);
    }
}
    
    
    

