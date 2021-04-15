import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) throws Exception {
		// Declaro o Scanner como entrada atraves do in , ou seja , como entrada de
		// dados atraves do teclado
		Scanner in = new Scanner(System.in);
		System.out.println("Digite 1 para somar: ");
		System.out.println("Digite 2 para subtrair: ");
		System.out.println("Digite 3 para multiplicar: ");
		System.out.println("Digite 4 para dividir: ");
		System.out.println("_________________________");
		// Aqui ele pega o numero ou valor digitado e executa a proxima ação.
		int i = in.nextInt();
		// a partir daqui eu coloco duas condições onde peço o numero para as operações
		// serem feitas
		System.out.println("Digite o primeiro numero:");
		double num1 = in.nextDouble();
		System.out.println("Digite o segundo numero:");
		double num2 = in.nextDouble();
		double resultado = 0;
			
		MetodosCalculadora total = new MetodosCalculadora();	
		total.setNum1(num1);
		total.getNum1();
		total.setNum2(num2);
		total.getNum2();
		System.out.println("dados digitados " + total.getNum1() + "," + total.getNum2());
		switch (i) {
		case 1:
			resultado = total.somar(num1, num2) ;
			break;
		case 2:
			resultado = total.subtrair(num1, num2);
			break;
		case 3:
			resultado = total.multiplicacao(num1, num2);
			break;
		case 4:
			resultado = total.divisao(num1, num2);
			break;
		default:
			throw new Exception("valor invalido");
		}

		System.out.println(resultado);
	
		}
	}


// aqui declaro a condição usando o laço do if e else.
