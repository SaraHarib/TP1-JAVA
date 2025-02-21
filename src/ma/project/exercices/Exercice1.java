package ma.project.exercices;

import java.util.Scanner;

public class Exercice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Saisir le nombre d'éléments du tableau : ");
		int n = sc.nextInt();
		int tab[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Saisir le nombre " + (i + 1) + ": ");
			tab[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			System.out.println(" le nombre " + (i + 1) + " est : " + tab[i]);
		}
		for (int i = 0; i < n; i++) {
			int m = 0;
			for (int j = 0; j < n; j++) {
				if (j != i && tab[i] == tab[j]) {
					m = tab[i];
					break;
				}

			}
			if (m == 0) {
				System.out.println("le nombre unique est : " + tab[i]);
			}
		}

	}

}
