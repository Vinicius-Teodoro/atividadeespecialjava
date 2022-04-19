import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    Scanner var = new Scanner(System.in);
    System.out.println("Me diga O valor de N (número de termos)");
    int n = var.nextInt();
    System.out.println("Me diga O valor de a1 (valor inicial)");
    int a1 = var.nextInt();
    System.out.println("Me diga O valor de q (razão)");
    int q = var.nextInt();
    
    float sn = a1 * (q ^ n -1) / (q - 1);
    System.out.println("O Resultado é:" + sn);
}
}

