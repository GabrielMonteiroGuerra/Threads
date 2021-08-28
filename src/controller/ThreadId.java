package controller;

//Para uma classe ser considerada Thread ela precisa de extends threads, para herdar as características de uma thread
//Todos os parâmetros são passados pelo construtor
//método run(), só vai ser executado o que tiver dentro do método run


public class ThreadId extends Thread { //Transformando a classe em Thread com extends
	
	private int idThread;
	
	
	public ThreadId(int idThread) {
		this.idThread = idThread;
	}

	

	@Override
	public void run() {
		//Só se executa o que está aqui dentro
		System.out.println(idThread);
	}
	
	

}
