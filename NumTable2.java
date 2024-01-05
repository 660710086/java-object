import java.util.Scanner;

/**
 * NumTable2
 */
public class NumTable2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr_table[][] = new int[row][col];
        for (int i = 0; i < arr_table.length; i++) {
            for (int j = 0; j < arr_table[i].length; j++) {
                arr_table[i][j] = sc.nextInt();
            }
        }

        int after = -1;
        boolean check = false;
        String result = "";

        int loop = sc.nextInt();
        for (int i = 0; i < loop; i++) {
            int num1 = sc.nextInt() - 1;
            int num2 = sc.nextInt() - 1;
            if (row <= num1 || num1 < 0 || num2 >= col || num2 < 0) {
                if (check) {
                    check = false;
                    result += "\n";
                    after = -1;
                }
                continue;

            }

            if (arr_table[num1][num2] == after) {
                result += "*";
                check = true;

            } 
            else
            {
                result += Integer.toString(arr_table[num1][num2]);
                check = true;

            }
            after = arr_table[num1][num2];

        }
        System.out.println(result);

    }
}