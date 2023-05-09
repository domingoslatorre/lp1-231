package semana11;

public class Aquario {
    public double comprimento;
    public double altura;
    public double largura;

    public double calcularVolume() {
        return (comprimento * altura * largura) / 1000;
    }
}
