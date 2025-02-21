package ma.project.exercices;

import java.util.Scanner;

public class Exercice6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Saisir le nombre de lignes : ");
		int L = sc.nextInt();

		int tab[][] = new int[L][];
		int t[] = new int[L];
		for (int i = 0; i < L; i++) {
			System.out.print("Saisir le nombre de colonnes dans la ligne " + (i + 1) + ": ");
			int C = sc.nextInt();
			tab[i] = new int[C];
			t[i] = C;
		}
		for (int i = 0; i < L; i++) {
			for (int j = 0; j < t[i]; j++) {
				System.out.print("Saisir le nombre de la ligne " + (i + 1) + " et la colonne " + (j + 1) + " : ");
				int n = sc.nextInt();
				tab[i][j] = n;
			}
		}

		for (int i = 0; i < L; i++) {
			for (int j = 0; j < t[i]; j++) {
				System.out.print(tab[i][j] + " ");
			}
			System.out.println(" ");
		}
		int S[] = new int[L];
		for (int i = 0; i < L; i++) {
			S[i] = 0;
			for (int j = 0; j < t[i]; j++) {
				S[i] += tab[i][j];
			}
		}
		for (int i = 0; i < L; i++) {
			System.out.println("La Somme de la ligne " + (i + 1) + "  : " + S[i]);
		}
	}

}
