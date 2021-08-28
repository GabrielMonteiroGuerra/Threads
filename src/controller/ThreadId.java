package controller;

//Para uma classe ser considerada Thread ela precisa de extends threads, para herdar as caracter�sticas de uma thread
//Todos os par�metros s�o passados pelo construtor
//m�todo run(), s� vai ser executado o que tiver dentro do m�todo run


public class ThreadId extends Thread { //Transformando a classe em Thread com extends
	
	private int idThread;
	
	
	public ThreadId(int idThread) {
		this.idThread = idThread;
	}

	

	@Override
	public void run() {
		//S� se executa o que est� aqui dentro
		System.out.println(idThread);
	}
	
	

}
