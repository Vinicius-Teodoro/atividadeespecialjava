import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    Scanner var = new Scanner(System.in);
    System.out.println("Me diga um numero");
    int num = var.nextInt();
    while (num > 0){
        
        int vari = 0;
        vari = vari + 1;
        while (vari <= num){
            System.out.println(vari);
            vari = vari + 1;
        }
        System.out.println("\n");
        num = num -1;

     
    }

}
}