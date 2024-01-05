import java.util.Scanner;

public class Account1 {

    public void plus (int num){
        System.out.println(num + 10000);
    }
    public static void main(String[] args) {
        Account1 a = new Account1();
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        a.plus(num);
        
    }
    
}
