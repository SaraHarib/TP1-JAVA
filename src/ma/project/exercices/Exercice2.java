package ma.project.exercices;

import java.util.Scanner;

public class Exercice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Saisir le nombre d'éléments du tableau : ");
		int n = sc.nextInt();

		System.out.print("Saisir le nombre souhaité: ");
		int m = sc.nextInt();

		int tab[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Saisir le nombre " + (i + 1) + ": ");
			tab[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			for (int j = (i + 1); j < n; j++) {
				if ((tab[i] + tab[j]) == m) {
					System.out.print("( " + tab[i] + "," + tab[j] + "), ");
				}
			}
		}
	}

}
