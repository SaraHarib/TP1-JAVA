package ma.project.exercices;

public class Exercice4 {
    
    public static int kadaneAlgorithm(int[][] T, int n, int m) {
        int max_t = 0;
        int pos = 0;
        
        for (int i = 0; i < n; i++) {
            int maxEndingHere = 0;
            int maxSoFar = 0;
            
            for (int j = 0; j < m; j++) {
                maxEndingHere += T[i][j];
                maxEndingHere = Math.max(maxEndingHere, 0);
                maxSoFar = Math.max(maxSoFar, maxEndingHere);
            }
            
            if (maxSoFar > max_t) {  
                max_t = maxSoFar;
                pos = i;  
            }
        }
        
        System.out.print("Sous tableau maximal [");
        for (int j = 0; j < m; j++) {
            System.out.print("\t" + T[pos][j]);
        }
        System.out.println("]");
        
        return max_t;
    }
    
    public static void main(String[] args) {
        int[][] T = {
            {-2, 1, -3, 4},
            {-1, 2, 1, -5},
            {4, -1, 2, 1}
        };
        
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                System.out.print(T[i][j] + " ");
            }
            System.out.println();
        }
        
        int k = kadaneAlgorithm(T, T.length, T[0].length);
        System.out.println("\tSomme est : " + k);
    }
}
