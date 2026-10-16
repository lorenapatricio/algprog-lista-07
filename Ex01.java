import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
      
     double[][] matriz = new double[4][4];
     double[] somaLinha= new double[4];
     double[] somaColuna = new double[4];
     double maior = 0;
     int trimestre = 0;
     
     Scanner scanner = new Scanner(System.in);
     for(int x = 0; x < matriz.length; x++) {
         for (int y = 0; y < matriz[x].length; y++) {
             System.out.println("Digite os valores das emissões da filial " + (x+1) + " no " + (y+1) + "º trimestre:");
             matriz[x][y] = scanner.nextDouble();
             somaLinha[x] += matriz[x][y];
         }
         
         System.out.println("Soma TOTAL da filial " + (x+1) + ":" + somaLinha[x]);
     }
      
      for(int y = 0; y < matriz.length; y++) {
         for (int x= 0; x < matriz[y].length; x++) {
             somaColuna[y] += matriz[x][y]; }
             
             if (y == 0) {
                 maior = somaColuna[y];
                 trimestre = y;
             }
        
             if (somaColuna[y] > maior) {
                 maior = somaColuna[y];
                 trimestre = y;
             }
         }
      
      System.out.println("Trimestre com maior emissão: " + (trimestre +1) + "º com um total de: " + maior);
      scanner.close();
    }
}
