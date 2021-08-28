package controller;

public class ThreadCalc extends Thread {
	
	private int a, b, op; //Criando variáveis
	
	
	public ThreadCalc(int a, int b, int op) {
		this.a = a;
		this.b = b;
		this.op = op;
		
	}

	@Override
	public void run() {	
		calc(); //Executando o método calc
	}

	private void calc() { //Método calc, método privado
		
		//Colocando uma thread em estado em de bloqueado
		int tempo = 1000; //Valor em milisegundos
		try {
			sleep(op * tempo);
		} catch (InterruptedException e) { //Dessa forma ela vai vir sempre na ordem
			e.printStackTrace();
		}
		
		
		int res = 0;
		String operacao = "";
		switch (op) {
		case 0:
			res = a + b;
			operacao = "+";
			break;
		case 1:
			res = a - b;
			operacao = "-";
			break;
		case 2:
			res = a * b;
			operacao = "*";
			break;
		case 3:
			res = a / b;
			operacao = "/";
			break;
		
		}
		
		System.out.println("TID #"+getId() + "===>"+a+" "+operacao+" "+b+" = "+res); //Fazendo a operação e mostrando qual Thread que é
		
		
	}

	
	
}
