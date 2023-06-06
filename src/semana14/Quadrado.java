package semana14;

public class Quadrado {
    private double lado;

    // Construtor
    public Quadrado(double lado) {
        setLado(lado);
    }

    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }

    // Getters
    // public TIPO_ATRIBUTO getNOME_ATRIBUTO() {
    //     return ATRIBUTO;
    // }

    public double getLado() {
        return lado;
    }

    // Setter
    // public void setNOME_ATRIBUTO(TIPO_ATRIBUTO ATRIBUTO) {
    //     this.ATRIBUTO = ATRIBUTO;
    // }
    public void setLado(double lado) {
        if (lado <= 0.0) {
            throw new RuntimeException("Lado inválido");
        }
        
        this.lado = lado;
    }


}
