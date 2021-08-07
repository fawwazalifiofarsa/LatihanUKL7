package LatihanUKL;
public class Latihan7 {
     public static void main(String[] args) {
    //Inisialisasi variabel matrix A
    int matrixA[][] = {{6,3,2}, {4,2,3}};
    //Inisialisasi variabel matrix B
    int matrixB[][] = {{1,2},{2,3},{3,1}};
    //Inisialisasi variabel matrix C
    int matrixC[][] = new int [matrixA.length][matrixB.length];
    
    //Menampilkan hasil perkalian matrix A dengan matrix B
        System.out.println("Perkalian matrix A dengan matrix B :");
        for (int i = 0; i < matrixA.length; i++){
            for (int j = 0; j < matrixA.length; j++){
                for (int k = 0; k < matrixB.length; k++){
                //Perkalian matrix A dengan matrix B
                matrixC[i][j] += matrixA[i][k] * matrixB[k][j]; 
                }
                System.out.print(matrixC[i][j]+" ");
            }
            System.out.println();
        }    
    }
}
