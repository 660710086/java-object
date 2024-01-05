import java.util.Arrays;
import java.util.Scanner;

public class ThreeNumber {

    public void Resulf(int num[], int s) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int mid = 0;

        for (int i = 0; i < num.length; i++) {
            if (max <= num[i]) {
                max = num[i];

            }
            if (min >= num[i]) {
                min = num[i];

            }
            if (num[i] != max && num[i] != min) {
                mid = num[i];
            }
        }

        if (s == -1) {
            System.out.println(min);

        } else if (s == 0) {
            System.out.println(mid);
        } else if (s == 1) {
            System.out.println(max);
        }

    }

    public static void main(String[] args) {
        ThreeNumber Three = new ThreeNumber();
        Scanner sc = new Scanner(System.in);
        int arr_num[] = new int[3];
        for (int i = 0; i < 3; i++) {
            arr_num[i] = sc.nextInt();

        }

        int start = sc.nextInt();
        Three.Resulf(arr_num, start);

    }

}
