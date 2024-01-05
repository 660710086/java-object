import java.util.Scanner;

import org.w3c.dom.events.Event;

/**
 * ArrayExploration1
 */
public class ArrayExploration1 {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr_table [][] = new int [row+1][col+1];
        for (int i = 1; i < arr_table.length; i++) {
            for (int j = 1; j < arr_table[i].length; j++) {
                arr_table[i][j] = sc.nextInt();
            }
            
        }


        int loop = sc.nextInt();
        int integer = 0;
        int Negative_integer = 0;
        int Eeven = 0;
        int odd = 0;

        for (int i = 0; i < loop; i++) {
            int num_1 = sc.nextInt();
            int num_2 = sc.nextInt();

            if ((num_1 > 0 && num_2 > 0) && (num_1<= row && num_2 <= col)) {
                // System.out.println("1>. "+num_1 +" || 2>. "+ num_2+" >>  "+arr_table[num_1][num_2]);
                
                if (arr_table[num_1][num_2] > 0) {
                    // System.out.println("IN >> integer ++");
                    integer++;
                    
                }else if(arr_table[num_1][num_2] < 0){
                    // System.out.println("IN >> Negative integer ++ ");
                    Negative_integer++;
                }

                if (arr_table[num_1][num_2] % 2 == 0) {
                    // System.out.println("IN >> Eeven++");
                    Eeven++;
                    
                }else{
                    // System.out.println("In >> odd ++");
                    odd++;
                }
                
            }else{
                continue;
            }
            
        }
        System.out.println(integer + " " + Negative_integer + " "+Eeven + " " +odd);
        
     }
}