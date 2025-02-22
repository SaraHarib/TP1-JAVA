package ma.project.exercices;

import java.util.Scanner;

public class Exercice5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Saisir le nombre de lignes : ");
		int L = sc.nextInt();

		System.out.print("Saisir le nombre de colonnes : ");
		int C = sc.nextInt();

		int tab[][] = new int[L][C];

		for (int i = 0; i < L; i++) {
			for (int j = 0; j < C; j++) {
				System.out.print("Saisir le nombre de la ligne " + (i + 1) + " et la colonne " + (j + 1) + " : ");
				int n = sc.nextInt();
				tab[i][j] = n;
			}
		}

		if (L != C) {
			System.out.println("Ce n'est pas une matrice carrée");
		} else {
			int m = 1;
			for (int i = 0; i < L; i++) {
				for (int j = 0; j < C; j++) {
					if (m == tab[i][j]) {
						m++;
					}
				}
			}
			m--;
			if (m == tab[(L - 1)][(C - 1)]) {
				System.out.println("C'est une permutation");
			} else {
				System.out.println("Erreur");

			}
		}
	}

}
