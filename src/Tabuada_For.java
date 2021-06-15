import java.util.Scanner;

public class Tabuada_For {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int n, tabuada;
		
		System.out.println("Tabuada com Loop For\n");
		
		System.out.println("Escolha o número para calcular a Tabuada:");
		n = leitor.nextInt();
		
		for (int i = 1; i <=10; i++ ) 
		{
			tabuada = n * i;
			System.out.println(n + " x " + i + " = " + tabuada);
			
		}
		
		leitor.close();

	}

}
