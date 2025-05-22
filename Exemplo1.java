public class Exemplo1 {
    public static void main(String... args) {
        int numeros[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        // Medição para soma iterativa
        long inicio = System.nanoTime();
        int resultadoIterativo = somaIterativa(numeros);
        long fim = System.nanoTime();
        System.out.println("Soma Iterativa: " + resultadoIterativo + " - Tempo: " + (fim - inicio) + "ns");
        
        // Medição para soma recursiva
        inicio = System.nanoTime();
        int resultadoRecursivo = somaRecursiva(numeros, 0);
        fim = System.nanoTime();
        System.out.println("Soma Recursiva: " + resultadoRecursivo + " - Tempo: " + (fim - inicio) + "ns");
    }

    static int somaIterativa(int[] vetor) {
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return soma;
    }

    static int somaRecursiva(int[] vetor, int i) {
        if (i >= vetor.length) {
            return 0;
        }
        return vetor[i] + somaRecursiva(vetor, i + 1);
    }
}