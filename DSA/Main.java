package DSA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=3;
        int M=4;
        int [][]matrix=new int[N][M];
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
