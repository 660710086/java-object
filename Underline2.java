import java.util.Scanner;

public class Underline2 {

    static void UnderLine(String input,int round){
        System.out.println(input);
        for (int i = 0; i < round; i++) {
            System.out.print("-");
            
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int round = sc.nextInt();

        String arr_Round [] = new String[round];

        for (String input : arr_Round) {
            input = sc.next();
            int num = sc.nextInt();
            UnderLine(input, num);  
        }
        
    }
    
}
