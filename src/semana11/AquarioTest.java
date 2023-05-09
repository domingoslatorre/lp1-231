package semana11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AquarioTest {
    
    @Test
    public void testaCalcularVolume() {
        Aquario aquario = new Aquario();
        aquario.comprimento = 100.00;
        aquario.largura = 50.00;
        aquario.altura = 50.00;

        double volume = aquario.calcularVolume();

        assertEquals(250.00, volume);
    } 

    @Test
    public void testaCalcularVolume2() {
        Aquario aquario = new Aquario();
        aquario.comprimento = 225.00;
        aquario.largura = 30.00;
        aquario.altura = 22.00;

        double volume = aquario.calcularVolume();

        assertEquals(148.50, volume);
    }

    @Test
    public void testaCalcularVolumeComDelta() {
        Aquario aquario = new Aquario();
        aquario.comprimento = 100.33;
        aquario.largura = 50.33;
        aquario.altura = 50.33;

        double volume = aquario.calcularVolume();

        assertEquals(254.146, volume, 0.001);
    }

}
