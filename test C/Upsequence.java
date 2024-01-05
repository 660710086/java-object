import java.util.Scanner;

public class Upsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int loop = sc.nextInt();
        int arr [] = new int[loop+1];
        for (int i = 0 ; i < loop ; i++)
        {
            arr [i] = sc.nextInt();
        }

        for (int i = 0 ; i < loop ; i++)
        {
            if (arr [i] >= arr[i+1])
            {
                System.out.println(arr[i]);
            }
        }
        sc.close();
    }
}
