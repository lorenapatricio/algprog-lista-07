import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
     double[][] matriz = new double[3][5];
     
     Scanner scanner = new Scanner(System.in);
     double soma = 0;
     double media;
     
     for(int x = 0; x < matriz.length; x++) {
         for(int y = 0; y < 5; y++) {
             System.out.println("Digite o valor da eficiência da linha " + (x+1) + " da coluna " + (y+1) + ":");
             matriz[x][y] = scanner.nextDouble();
             
             while(matriz[x][y] < 0 || matriz[x][y] > 1) {
                 System.out.println("Valor inválido. Digite um numero entre 0 e 1");
                 matriz[x][y] = scanner.nextDouble();
             }
             
             soma += matriz[x][y];
         }
     }
     
     media = soma / 15;
     
     System.out.println("A média global é : " + media);
     
     for(int x = 0; x < matriz.length; x++) {
         for(int y = 0; y < 5; y++) {
             if (matriz[x][y] < media) {
                 System.out.println("Está operando abaixo da média: " + matriz[x][y] + " na linha " + (x+1) + " na coluna " + (y+1) + ".");
             }
         }
     }
     
     scanner.close();
    }
}
