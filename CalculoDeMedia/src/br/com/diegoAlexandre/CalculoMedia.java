package br.com.diegoAlexandre;

public class CalculoMedia {
	
	public static void main(String[] args) {
		
		double nota1 = 10;
		double nota2 = 7.5;
		double nota3 = 6;
		double nota4 = 8.9;
		
		double somaDaNotas = nota1 + nota2 + nota3  + nota4;
		double media = somaDaNotas / 4;
		
		System.out.println("Média das notas: " + media);
		
	}

}
