package lista_PP;
import java.util.Scanner;


public class ex3 {

	
	
	
	private static int[]  preencherVetor(int[] vetor, Scanner scanner){
		
		for(int i = 0; i < 20; i++ ) {
			System.out.printf("Digite o valor do vetor na posicao %d: \n ", i);
			
			vetor[i] = scanner.nextInt();	
		}  
        
       return vetor ;
    		   
    }
	
	private static int[] organizarVetor(int[] vetor) {
		
		for(int i = 0; i < 20; i++) {
			System.out.printf("%d, " , vetor[i]);
		} 
		
		
		for (int i = 0; i < 20; i++) {
            if (i % 2 == 0 && vetor[i] % 2 == 0) { // posição par e número par
                	
            	int proximoImpar = encontrarProximoImpar(vetor, i);
                if (proximoImpar != -1) {
                    trocar(vetor, i, proximoImpar);
                }
            } else if (i % 2 != 0 && vetor[i] % 2 != 0) { // posição ímpar e número impar
            	int proximoPar = encontrarProximoPar(vetor, i);
                if (proximoPar != -1) {
                    trocar(vetor, i, proximoPar);
                }
            }
        }
		
		
		System.out.println("Vetor reorganizado: \n ");
		for(int i = 0; i < 20; i++) {
			System.out.printf("%d, " , vetor[i]);
		} 
		
		
		return vetor;
	}
	
	
	 // Função auxiliar para encontrar a próxima posição com um número par a partir da posição atual
    private static int encontrarProximoPar(int[] vetor, int posicaoAtual) {
        for (int i = posicaoAtual + 1; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                return i;
            }
        }
        return -1; // Retorna -1 se não encontrar um número par para buscar o numero par nos valores anteriores
    }

	
	// Função auxiliar para encontrar a próxima posição com um número ímpar a partir da posição atual
    private static int encontrarProximoImpar(int[] vetor, int posicaoAtual) {
        for (int i = posicaoAtual + 1; i < vetor.length; i++) {
            if (vetor[i] % 2 != 0) {
                return i;
            }
        }
        return -1; // Retorna -1 se não encontrar um número ímpar para buscar o numero impar nos valores anteriores
    }

    // Função auxiliar para trocar os valores entre duas posições do vetor
    private static void trocar(int[] vetor, int posicao1, int posicao2) {
        int temp = vetor[posicao1];
        vetor[posicao1] = vetor[posicao2];
        vetor[posicao2] = temp;
    }

	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {

		    int[] vetor = new int[20];
		    
	        Scanner scanner = new Scanner(System.in);
	        
	       
	        
	       //  organizarVetor(preencherVetor(vetor, scanner)); 
	        preencherVetor(vetor, scanner);
	        organizarVetor(vetor);
	        
	        
	        

		    
		    
		    
		}

	}

