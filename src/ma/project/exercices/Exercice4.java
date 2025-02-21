package ma.project.exercices;

import java.util.Scanner;

public class Exercice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Saisir le nombre de lignes :  ");
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

		System.out.println();
		for (int i = 0; i < L; i++) {
			for (int j = 0; j < C; j++) {
				System.out.print("  " + tab[i][j]);
			}
			System.out.println();
		}
		int s[] = new int[L];
		for (int i = 0; i < L; i++) {
			for (int j = 0; j < C; j++) {
				s[i] += tab[i][j];
			}
		}
		int m = 0;
		for (int i = 0; i < L; i++) {
			for (int j = 0; j < L; j++) {
				if (s[i] > s[j]) {
					m = i;
				} else {
					m = j;
				}
			}

		}
		System.out.println();
		for (int i = 0; i < C; i++) {
			System.out.print(" " + tab[m][i]);
		}
		System.out.println(" = " + s[m]);
	}

}
