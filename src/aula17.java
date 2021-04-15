
import java.util.Scanner;


public class aula17 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		final int ij, iI;
		ij = 17;
		iI = 60;
		
		System.out.println("digite um valor:");
		int idade = in.nextInt();
			
		if(idade  <= ij) {
			System.out.println("idade de um jovem");
			}else {
				if(idade >= iI) {
					System.out.println("idade de um velhinho!");
				}else {
					if((idade > ij)&&(idade < iI)) {
							System.out.println("jovem");
					}
				}
			}
		}
		
	}

