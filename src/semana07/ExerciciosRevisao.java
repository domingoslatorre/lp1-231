package semana07;

public class ExerciciosRevisao {
    
    public static void main(String[] args) {
        double[] numeros = { 10.0, 2.2, 3.0 };

        System.out.println(calcularSoma(10.0, 2.2, 3.0));
        System.out.println(calcularSoma(numeros));

        System.out.println(calcularMedia(10.0, 2.2, 3.0));
        System.out.println(calcularMedia(numeros));

        System.out.println(encontrarMaior(10, 2, 3));
        System.out.println(encontrarMaior(numeros));

        System.out.println(encontrarMenor(10, 2, 3));
        System.out.println(encontrarMenor(numeros));

        double[] arrayCriado = criarArray(10.0, 2.2, 3.0);
        for (double numero : arrayCriado) {
            System.out.println(numero);
        }

        int[] inteiros1 = {3, 10};
        int[] inteiros2 = {15, 20, 33};
        int[] novoArray = juntarArrays(inteiros1, inteiros2);
        for (int i : novoArray) {
            System.out.println(i);
        }
    }


    // 1. Escreva um método estático em Java que recebe três parâmetros double e 
    // devolve a soma dos valores;
    public static double calcularSoma(double a, double b, double c) {
        return a + b + c;
    }
    
    // 2. Escreva um método estático em Java que recebe três parâmetros double e 
    // devolve a média aritmética simples dos valores;
    public static double calcularMedia(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    // 3. Escreva um método estático em Java que recebe três parâmetros int e 
    // devolve o maior valor;
    public static int encontrarMaior(int a, int b, int c) {
        int maior = a;

        if (b > maior) {
            maior = b;
        }

        if (c > maior) {
            maior = c;
        }

        return maior;
    }
    
    // 4. Escreva um método estático em Java que recebe três parâmetros int e 
    // devolve o menor valor;
    public static int encontrarMenor(int a, int b, int c) {
        int menor = a;
        
        if (b < menor) {
            menor = b;
        }

        if (c < menor) {
            menor = c;
        }
        
        return menor;
    }
    
    
    // 5. Escreva um método estático em Java que recebe três parâmetros double 
    // devolve um array com os valores passados nos parâmetros;
    public static double[] criarArray(double a, double b, double c) {
        double[] array = { a, b, c };
        return array;
    }

    // 6. Escreva um método estático em Java que recebe um array de double e 
    // devolve a soma dos valores;
    public static double calcularSoma(double[] array) {
        double soma = 0;
        for (double valor : array) {
            soma += valor;
        }
        return soma;
    }


    // 7. Escreva um método estático em Java que recebe um array de double e 
    // devolve a média aritmética;
    public static double calcularMedia(double[] array) {
        return calcularSoma(array) / array.length;
    }
    
    // 8. Escreva um método estático em Java que recebe um array de double e 
    // devolve o maior valor;
    public static double encontrarMaior(double[] array) {
        double maior = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }
        return maior;
    }
    
    // 9. Escreva um método estático em Java que recebe um conjunto de valor 
    // e devolve o menor valor
    public static double encontrarMenor(double[] array) {
        double menor = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
            }
        }
        return menor;
    }

    // 10. Escreva um método em Java que recebe dois array de inteiros 
    // e devolve uvolve um array com todos os elementos do primeiro e do segundo array.
    public static int[] juntarArrays(int[] array1, int[] array2) {
        int[] resultado = new int[array1.length + array2.length];
        int indice = 0;
        for (int valor : array1) {
            resultado[indice] = valor;
            indice++;
        }
        for (int valor : array2) {
            resultado[indice] = valor;
            indice++;
        }alor : array1) {
            resultado[indice] = valor;
            indice++;
        }
        for (int valor : array2) {
            resultado[indice] = valor;
            indice++;
        }
        return resultado;
    }
}
