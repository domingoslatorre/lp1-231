package semana06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    public void somaDoisNumerosPositivos() {
        // AAA

        // Arrange
        double numero1 = 10.0;
        double numero2 = 2.0;

        // Act
        double soma = Calculadora.somar(numero1, numero2);

        // Assert
        assertEquals(12.0, soma);
    }

    @Test
    public void somaUmNumeroPositivoEUmNegativo() {
        double numero1 = 10.0;
        double numero2 = -2.0;

        double soma = Calculadora.somar(numero1, numero2);

        assertEquals(8.0, soma);
    }

    @Test
    public void somaDoisNumerosNegativo() {
        double numero1 = -10.0;
        double numero2 = -2.0;

        double soma = Calculadora.somar(numero1, numero2);

        assertEquals(-12.0, soma);
    }
}
