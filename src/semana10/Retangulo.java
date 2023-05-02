package semana10;

// Classe
public class Retangulo {
    // Atributos
     double base;
    public double altura;

    // Métodos
    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}
