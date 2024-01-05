import java.util.Scanner;

public class ArrayExploration2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int arr_num[][] = new int[row][col];
        // System.out.println("ROW : " + arr_num.length + " || COL : " + arr_num[0].length);

        for (int i = 0; i < arr_num.length; i++) {
            for (int j = 0; j < arr_num[i].length; j++) {
                arr_num[i][j] = sc.nextInt();
            }

        }

        int integer = 0;
        int Negative_integer = 0;
        int even = 0;
        int odd = 0;

        boolean check_I = false;
        boolean check_N = false;
        boolean check_E = false;
        boolean check_O = false;

        int loop = sc.nextInt();
        for (int i = 0; i < loop; i++) {
            int num_1 = sc.nextInt();
            int num_2 = sc.nextInt();
            num_1--;
            num_2--;
            if (num_1 < row && num_2 < col && num_1 >= 0 && num_2 >= 0) {
                check_I = false;
                check_N = false;
                check_E = false;
                check_O = false;
                // System.out.println("RoW : " + num_1 + " || CoL :  " + num_2 + " >> " + arr_num[num_1][num_2]);
                if (arr_num[num_1][num_2] > 0) {
                    integer++;
                    check_I = true;

                } else if (arr_num[num_1][num_2] < 0) {
                    Negative_integer++;
                    check_N = true;

                }

                if (arr_num[num_1][num_2] % 2 == 0) {
                    even++;
                    check_E = true;

                } else {
                    odd++;
                    check_O = true;
                }

            } else {
                if (check_I) {
                    integer++;
                    
                }
                if (check_N) {
                    Negative_integer++;
                }
                    
                 if(check_E){
                    even++;
                }
                if(check_O){
                    odd++;
                }

            }

        }

        System.out.println(integer + " " + Negative_integer + " " + even + " " + odd );
    }

}
