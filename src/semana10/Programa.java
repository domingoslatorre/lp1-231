package semana10;

public class Programa {
    public static void main(String[] args) {
        // calcular a area e perimetro retangulo
        // area = base * altura
        // perimetro = 2 * (base + altura)

        // Entrada
        double baseRet1 = 10.0;
        double alturaRet1 = 5.0;

        // Processamento
        double areaRet1 = calcularArea(baseRet1, alturaRet1);
        double perimetroRet1 = calcularPerimetro(baseRet1, alturaRet1);

        // Saída
        System.out.println(areaRet1);
        System.out.println(perimetroRet1);

        double baseRet2 = 30.0;
        double alturaRet2 = 10.0;

        double areaRet2 = calcularArea(baseRet2, alturaRet2);
        double perimetroRet2 = calcularPerimetro(baseRet2, alturaRet2);

        System.out.println(areaRet2);
        System.out.println(perimetroRet2);

        // Tipo nomevariavel = valor
        String palavra = "abc";
        System.out.println(palavra.toUpperCase());

        // Objeto (instância) da classe Retangulo
        Retangulo ret1 = new Retangulo();
        ret1.base = 10.0;
        ret1.altura = 5.0;

        Retangulo ret2 = new Retangulo();
        ret2.base = 30.0;
        ret2.altura = 30.0;

        System.out.println(ret1.calcularArea());
        System.out.println(ret1.calcularPerimetro());

        System.out.println(ret2.calcularArea());
        System.out.println(ret2.calcularPerimetro());

        // System.out.println(Math.PI);
        // System.out.println(Math.pow(raio, 2));

        Quadrado q1 = new Quadrado();
        q1.lado = 10.0;
        System.out.println(q1.calcularArea());
        System.out.println(q1.calcularPerimetro());
        
        Circulo c1 = new Circulo();
        c1.raio = 50.0;
        System.out.println(c1.calcularArea());
        System.out.println(c1.calcularPerimetro());

    }

    public static double calcularArea(double base, double altura) {
        return base * altura;
    }

    public static double calcularPerimetro(double base, double altura) {
        return 2 * (base + altura);
    }

}
