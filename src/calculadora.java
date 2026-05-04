import java.util.Scanner;

public class calculadora {

    int x;
    int y;

    void  calcular(){
        Scanner sc = new Scanner(System.in);
       x= sc.nextInt();
       y = x*2;
       System.out.println("O dobro de "+ x +" é igual a "+ y);
    }
}
