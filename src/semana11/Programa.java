package semana11;

public class Programa {
    public static void main(String[] args) {
        Aquario aquario = new Aquario();
        aquario.comprimento = 100.00;
        aquario.largura = 50.00;
        aquario.altura = 50.00;

        double volume = aquario.calcularVolume();

        System.out.println(volume);
    }
}
