package controller;

public class ThreadController extends Thread {
	
	private int v[];
	private int i;
	
	
	public ThreadController(int v[], int i) {
		this.v = v;
		this.i = i;
	}

	@Override
	public void run() {
			int soma = 0;
			for (int j = 0; j < 5; j++) {
				soma += v[j];
				}
			System.out.println("A soma do vetor ["+(i)+"] é = " + soma);
	}	
}
