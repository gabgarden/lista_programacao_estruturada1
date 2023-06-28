package lista_PP;
import java.security.SecureRandom;


public class ex1 {

	
	private static int[][] gerarMatriz(){
		
			
	        int[][] matriz = new int[4][5];

	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 5; j++) {
	                matriz[i][j] = new SecureRandom().nextInt(20);
	            }
	        }
	        
	        
	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 5 ; j++) {
	              System.out.printf("%d - ", matriz[i][j]);
	            }
	            System.out.printf("%n");
	        }
	        
	       return matriz;
	    		   
	    }
	
	
	
	// retornando o menor valor dentre os somatorios de todas as colunas.
	private static int somatorioColunas(int[][] matriz) {
		
		int menorValor = -1;
		
		 for (int j = 0; j < 5; j++) {
			 
			 int somatorio = 0;
			 
	            for (int i = 0; i < 4; i++) {
	            	
	            	somatorio += matriz[i][j];
	            	
	            }
	            
            if (somatorio < menorValor || menorValor == -1) {
	            	menorValor = somatorio;
	            }
	        }
		 
		 return menorValor;
		 
		
	}
	
	private static int produtorioLinhas(int[][] matriz) {
		int maiorValor = 0;
		
		for (int i = 0; i < 4; i++) {
			
			int produtorio = 1;
			
				for (int j = 0; j < 5; j++) {
					
					produtorio *= matriz[i][j];
				}
			    
            if (produtorio > maiorValor) {
	            	maiorValor = produtorio;
		            }
		}
		
		return maiorValor;
	}
	
	private static boolean verificarCondicao(int[][] matriz) {
		
		System.out.println(somatorioColunas(matriz));
		System.out.println(produtorioLinhas(matriz));
		
		return somatorioColunas(matriz) <= produtorioLinhas(matriz);		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {

        int[][] matriz = gerarMatriz();
        
        if (verificarCondicao(matriz)) {
        	System.out.println("Condicao Satisfeita");
        } else {
        	System.out.println("Condicao nao Satisfeita");
        }
        
        

		}

	
}

