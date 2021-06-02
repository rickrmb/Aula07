import java.util.Scanner;

public class Calculadora {

	
	public static double resultado=0;
	
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double valor1 = 0, valor2=0;
		double soma, subtracao, divisao, multiplicacao;
		int opcao = 0;
		
		while (opcao!=6) {
			exibirMenu();
			opcao = leitor.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("\n\nDigite o 1º valor:");
				valor1 = leitor.nextDouble();
				System.out.println("\n\nDigite o 2º valor:");
				valor2 = leitor.nextDouble();
				
				System.out.println("Os valores " + valor1 + " e " + valor2 + " foram armazenados\n\n");
				
				break;
			case 2:
				System.out.println("\n\nRealizando a soma entre " + valor1 + " e " + valor2);
				resultado = valor1 + valor2;
				System.out.println("O resultado foi " + resultado + "!\n\n");
				
				break;
			case 3:
				System.out.println("\n\nRealizando a subtração entre " + valor1 + " e " + valor2);
				resultado = valor1 - valor2;
				System.out.println("O resultado foi " + resultado + "!\n\n");
				break;
			case 4:
				System.out.println("\n\nRealizando a divisão entre " + valor1 + " e " + valor2);
				resultado = valor1 / valor2;
				System.out.println("O resultado foi " + resultado + "!\n\n");
				break;
			case 5:
				System.out.println("\n\nRealizando a multiplicação entre " + valor1 + " e " + valor2);
				resultado = valor1 * valor2;
				System.out.println("O resultado foi " + resultado + "!\n\n");
				break;
			case 6:
				System.out.println("Saindo do sistema");
				break;
			}
			
		}
		leitor.close();
		

	}

	
	//modificador static tipoRetorno nomeMetodo(){}
	
	
	public static void exibirMenu() {
		System.out.println("PROGRAMA CALCULADORA");
		System.out.println("Escolha sua opção!");
		System.out.println("1 - Digitar valores");
		System.out.println("2 - Realizar soma");
		System.out.println("3 - Realizar subtração");
		System.out.println("4 - Realizar divisão");
		System.out.println("5 - Realizar multiplicação");
		System.out.println("6 - Sair");
	}
	
	public static void imprimirResultado() {
		System.out.println("O resultado é " + resultado + "!\n\n");
	}
	
	
}