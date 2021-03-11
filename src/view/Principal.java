package view;

import java.util.Random;

import controller.ThreadController;

public class Principal {
	
	public static void main(String[] args) {
		
	int m [][] = new int [3][5];
	int i =0;
	int j=0;
	for (i = 0; i < 3; i++) {
		for (j = 0; j < 5; j++) {
			m[i][j] = (int) (Math.random() * 11);
			System.out.println("O valor do m["+(i+1)+"]["+(j+1)+"] é: " + m[i][j]);
		}
	}
	
	Thread t1 = new ThreadController(m[0], 1);
	Thread t2 = new ThreadController(m[1], 2);
	Thread t3 = new ThreadController(m[2], 3);
	
	t1.start();
	t2.start();
	t3.start();
	}

}
