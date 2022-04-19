import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    Scanner var = new Scanner(System.in);
    System.out.println("Me diga O valor de vo (velocidade inicial)");
    int vo = var.nextInt();
    System.out.println("Me diga O valor de so (espaço inicial)");
    int so = var.nextInt();
    System.out.println("Me diga O valor de q (aceleração)");
    int a = var.nextInt();
    System.out.println("Me diga O valor de t (tempo)");
    int t = var.nextInt();
    
    float sn = so + vo * t + a * (t * t) / 2;
    System.out.println("O Resultado é:" + sn);
}
}