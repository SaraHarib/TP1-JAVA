package ma.project.exercices;

import java.util.Scanner;

public class Exercice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Saisir le nombre d'éléments du tableau : ");
		int n = sc.nextInt();

		int tab[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("saisir le nombre " + (i + 1) + ": ");
			tab[i] = sc.nextInt();
		}
		int m = tab[0];
		for (int i = 0; i < n; i++) {
			for (int j = (n - 1); j > i; j--) {
				if ((tab[i] % 2) != 0 && (tab[j] % 2) == 0) {
					m = tab[i];
					tab[i] = tab[j];
					tab[j] = m;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(tab[i] + " , ");
		}
	}
}
