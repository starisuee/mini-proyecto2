import java.util.Scanner;
public class App {
    static int num1;
    static int num2=2;
    static int res;

    static void suma(){
        res=num1+num2;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("introduce numero 1");
        num1 = sc.nextInt();
        suma();
        System.out.println("Hello, World!" + res);
    }
}
