package lista_PP;
import java.security.SecureRandom;

public class ex4 {
	
	
	

	
	public static int[] preencherVetor(int vetor[]) {
		
		for(int i = 0; i < 30; i++) {
			vetor[i] = new SecureRandom().nextInt(30);
		}
		
		return vetor;
	}
	
	
	public static void ordenarVetor(int[] vetor) {
        
        
        //  Em cada iteração, o loop interno é executado 
       // para comparar e trocar os elementos adjacentes, 
       //levando gradualmente o maior elemento para a última posição do vetor.
       // Isso é repetido até que todo o vetor esteja ordenado.
        
        boolean troca;

        for (int i = 0; i < 30 - 1; i++) {
            troca	 = false;
            
            for (int j = 0; j < 30 - 1 - i; j++) {
                if (vetor[j] < vetor[j + 1]) { // Compara os elementos adjacentes
                    // Troca os elementos de posição
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    troca = true;
                }
            }
            
            if (!troca) {
                // Se não houve trocas na passagem atual, o vetor já está ordenado
                break;
            }
        }
    }

	
	public static int imprimirVetor(int vetor[]) {
		for(int i = 0; i < 30; i++) {
			System.out.printf("%d ", vetor[i]);
		}
		
		System.out.println("\n \n");
		ordenarVetor(vetor);
		
		for(int i = 0; i < 30; i++) {
			System.out.printf("%d ", vetor[i]);
		}
		return 1;
		
	}
	
	public static void main(String[] args) {
		int vetor[] = new int[30];
		
		preencherVetor(vetor);
		
		
		imprimirVetor(vetor);
		
		
		
		
	}

}
