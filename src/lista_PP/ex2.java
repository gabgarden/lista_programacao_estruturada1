package lista_PP;
import java.security.SecureRandom;

public class ex2 {

	public static int[][] gerarMatriz() {
		
		int[][] matrizM = new int[4][4];
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				matrizM[i][j] = new SecureRandom().nextInt(30);
			}
		}
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				
				System.out.printf("%d \t", matrizM[i][j] );
			}
			
			System.out.println("\n");
		}
		
		System.out.println(" \n \n \n");

		
		return matrizM;
		
		
	}
	
	
	public static int[][] calcularTransposta(int[][] matrizM, int[][] matrizMT){
		

		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				matrizMT[j][i] = matrizM[i][j];
			}
		}
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				
				System.out.printf("%d \t", matrizMT[i][j] );
			}
			
			System.out.println("\n");
		}
		
		System.out.println(" \n \n \n");

		
		return matrizMT;
	}
	
	
	
	
	public static int[][] multiplicarMatrizes(int[][] matrizM, int [][] matrizMT){
		int[][] matrizResultado = new int[4][4];
		
		 for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 4; j++) {
	                for (int k = 0; k < 4; k++) {
	                    matrizResultado[i][j] += matrizM[i][k] * matrizMT[k][j];
	                }
	            }
	        }
		
		 for(int i = 0; i < 4; i++) {
				for(int j = 0; j < 4; j++) {
					
					System.out.printf("%d \t", matrizResultado[i][j] );
				}
				
				System.out.println("\n");
			}
			
			System.out.println(" \n \n \n");
		return matrizResultado;
	}
	
	
	public static boolean testandoMatriz(int [][] matrizResultado) {
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				
				if(matrizResultado[i][i] != 1 && matrizResultado[i][j] != 0) {
					return false;
				}
				
			}
			
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		
		int[][] matrizM = gerarMatriz();	
		int[][] matrizMT = new int[4][4];
		


		calcularTransposta(matrizM, matrizMT);
		int[][] matrizResultado = multiplicarMatrizes(matrizM, matrizMT);
		if (testandoMatriz(matrizResultado)){
			System.out.println("Matriz ortogonal");
		} else {
			System.out.println("Matriz não ortogonal");
		}
		
	}

}
