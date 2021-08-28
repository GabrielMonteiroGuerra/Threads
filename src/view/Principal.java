package view;

import controller.ThreadCalc;
import controller.ThreadId;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Para chamar 5 threads quase que simultaneamente
		
		for (int idThread = 0; idThread < 5; idThread++) { //Chamando 5 Threads
			
			ThreadId threadId = new ThreadId(idThread); //Método construtor
			threadId.start();
			
		}
		//É possível printar de qualquer ordem, porque a primeira que terminar é a primeira a printar

		System.out.println("==============================================================");
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		int a = sc.nextInt();
		System.out.println("Digite o valor de B: ");
		int b = sc.nextInt();
		
		for (int op = 0; op < 4; op++) {
			Thread tCalc = new ThreadCalc(a,b,op);
			tCalc.start();
		}
	}

}
