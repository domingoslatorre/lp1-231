package semana21;

import java.util.ArrayList;

// interface = contrato
// conjunto de métodos (somente assinatura, sem corpo)
// classe concreta que IMPLEMENTA a interface

// class abstrata FiguraGeometrica - 
// interface FiguraGeometrica

// Quadrado - lado - calcular Area e Perimetro
// Retangulo - base, altura - calcular Area e Perimetro
// Circulo - ??



public class Main {

    public static void main(String[] args) {
        System.out.println("Main...");

        Quadrado q1 = new Quadrado(10);
        Quadrado q2 = new Quadrado(20);

        Retangulo r1 = new Retangulo(10, 5);
        
        Tela tela = new Tela();
        tela.addFigura(q1);
        tela.addFigura(q2);
        tela.addFigura(r1);
        System.out.println(tela.totalArea());
        System.out.println(tela.totalPerimetro());


        // arrays
        double[] notas = new double[3];
        notas[0] = 10.0;
        notas[1] = 3.0;
        notas[2] = 5.0;
        // notas[3] = 5.0;

        System.out.println(notas[0]);

        // Coleções
        // List 
        // Set 
        // Map chave - valor


        // String[] nomes = new String[10];
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Pedro");

        String nome = nomes.get(1);
        System.out.println(nome);

        System.out.println(nomes.size());

        // nomes.clear();

        System.out.println(nomes.size());

        // for (int i = 0; i < nomes.size(); i++) {
        //     String nome = nomes.get(i);
        // }


        for (String n : nomes) {
           System.out.println(n);
        }

        // nomes.remove(1);
        nomes.remove("Maria");
        
        for (String n : nomes) {
            System.out.println(n);
        }

    }
}