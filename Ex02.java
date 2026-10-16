import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        
        int[][] matriz = new int[5][5];
        int cont0 = 0;
        int cont1 = 0;
        int cont2 = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.println("Classifique a postagem (Linha " + (x + 1) + ", Coluna " + (y + 1) + ") como:" + 
                                   "\n0: Conteúdo Seguro" + 
                                   "\n1: Conteúdo Suspeito (requer revisão)" + 
                                   "\n2: Conteúdo Nocivo (deve ser removido imediatamente)");
                
                matriz[x][y] = scanner.nextInt();
                
                while (matriz[x][y] != 0 && matriz[x][y] != 1 && matriz[x][y] != 2) {
                    System.out.println("Classificação inválida. Digite novamente (0, 1 ou 2):");
                    matriz[x][y] = scanner.nextInt();
                }
                
                if (matriz[x][y] == 0) {
                    cont0++;
                } else if (matriz[x][y] == 1) {
                    cont1++;
                } else if (matriz[x][y] == 2) {
                    cont2++;
                }
            }
        }
        
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Quantidade de postagens SEGURAS: " + cont0);
        System.out.println("Quantidade de postagens SUSPEITAS: " + cont1);
        System.out.println("Quantidade de postagens NOCIVAS: " + cont2);
        
        System.out.println("\nMATRIZ ATUAL:");
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(matriz[x][y] + " ");
            }
            System.out.println();
        }

        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                if (matriz[x][y] == 2) {
                    matriz[x][y] = -1;
                }
            }
        }
        
        scanner.close();
    }
}