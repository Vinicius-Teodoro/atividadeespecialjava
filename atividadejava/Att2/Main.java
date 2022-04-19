
public class Main {
public static void main(String[] args) {
    int k = 1000;
    int som = 0;
    while (k > 0){
    
        if (k % 3 == 0 || k % 5 == 0 ){
        som = som + k;

        }
        k = k -1;
    }
    System.out.println("O valor é:" + som);
}
}




    