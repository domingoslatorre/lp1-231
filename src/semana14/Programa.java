package semana14;

public class Programa {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(-10.0);
        // quadrado.lado = 0.0;
        quadrado.setLado(-10);

        System.out.println(quadrado.getLado());
 
        double area = quadrado.calcularArea();
        System.out.println(area);

        double perimetro = quadrado.calcularPerimetro();
        System.out.println(perimetro);

        Retangulo r1 = new Retangulo(10.0, 5.0);
        Retangulo r2 = new Retangulo(20.0, 30.0);
        Retangulo r3 = new Retangulo(15.0);

        System.out.println(r3.base);
        System.out.println(r3.altura);

        double numero = 10.0;

        System.out.println(numero);
        System.out.println(10.0); 
    }
}
