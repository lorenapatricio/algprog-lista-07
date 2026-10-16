import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
      
      int[][] matriz = new int[4][4];
      int maior = 0;
      int linha = 0;
      int coluna = 0;
      int diagonal =0;
      
      Scanner scanner = new Scanner(System.in);
      
      for(int x = 0; x < matriz.length; x++) {
          for (int y= 0; y < matriz[x].length; y++){
              System.out.println("Digite a temperatura " + (x+1) + " da coluna " + (y+1) + ":");
              matriz[x][y] = scanner.nextInt();
              if (x == 0) {
                  maior = matriz[x][y];
                  linha = x;
                  coluna = y;
              }
              
              if (matriz[x][y] > maior) {
                  maior = matriz[x][y];
                  linha = x;
                  coluna = y;
              }
              
              if (x == y) {
                  diagonal += matriz[x][y];
              }
          }
      }
      
      double media = (double) diagonal / 4;
      
      System.out.println("MAIOR TEMPERATURA: " + maior  + " OBTIDA NA LINHA " + (linha + 1) + " NA COLUNA " + (coluna +1));
      System.out.println("MÉDIA DA DIAGONAL PRINCIPAL: " + media);
      scanner.close();
    }
}
