import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
     int[][] matriz = new int[4][4];
     int soma = 0;
     
     Scanner scanner = new Scanner(System.in);
     
     for(int x = 0; x < matriz.length; x++) {
         for (int y = 0; y<matriz[x].length; y++) {
             System.out.println("Digite o tempo em minutos para a entrega da linha " +
              (x+1) + " na coluna " + (y+1) + ":");
              matriz[x][y] = scanner.nextInt();
              
              while(matriz[x][y] < 1) {
                  System.out.println("O tempo mínimo é de 1 minuto.");
                  matriz[x][y] = scanner.nextInt();
              }
              
              if(x == 0 || x == 3 || y == 0 || y == 3) {
                  soma += matriz[x][y];
              }
         }
     }
     
       System.out.println("====MATRIZ====");

       for(int x = 0; x < matriz.length; x++) {
         for (int y = 0; y<matriz[x].length; y++) {
             System.out.print(matriz[x][y] + " ");
         }
         System.out.println();
       }
       
       System.out.println("A soma das bordas é: " + soma + " minutos.");
       
       scanner.close();
    }
}
