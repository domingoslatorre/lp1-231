package semana21a;

import java.util.ArrayList;

// interface = contrato
// conjunto de métodos (somente assinatura, sem corpo)
// classe concreta que IMPLEMENTA a interface

// abstract class FiguraGeometrica 

// Quadradro - lado - calcular Area/Perimetro
// Retangulo - base, altura - calcularArea/Perimetro
// Circulo - ?
 

public class Main {
    public static void main(String[] args) {
        System.out.println("Main...");

        Tela tela = new Tela();

        Quadrado q1 = new Quadrado(10);
        Quadrado q2 = new Quadrado(20);
        Retangulo r1 = new Retangulo(10, 5);

        tela.addFigura(q1);
        tela.addFigura(q2);
        tela.addFigura(r1);

        System.out.println(tela.areaTotal());
        System.out.println(tela.perimetroTotal());

        // List
        // Set
        // Map 

        ArrayList<String> nomes = new ArrayList<>();

        // Adicionar 
        nomes.add("Maria"); // 0
        nomes.add("João");  // 1
        nomes.add("Pedro"); // 2
        nomes.add("João");  // 3

        // Tamanho
        System.out.println(nomes.size());

        // Remover um elemento
        nomes.remove(1);
        // nomes.remove("João");

        // 0      1     2     3  
        // Maria  Joao  Pedro Joao
        // Maria  Pedro Joao        B

        // Remove todos os elementos do Arraylist
        nomes.clear();

        // Pegar valor
        System.out.println(nomes.get(0));

        for (int i = 0; i < nomes.size(); i++) {
            String nome = nomes.get(i);
        }

        for (String nome : nomes) {
            
        }





    }
}
