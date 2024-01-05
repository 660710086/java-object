import java.util.Scanner;

/**
 * [StringPresenc
 */
public class StringPresenc {

    static boolean check(String in, String c) {

        for (int i = 0; i < c.length(); i++) {
            if (i <= c.length() - in.length()) {
                String check = c.substring(i, i + in.length());
                if (check.equals(in)) {
                    return true;

                }

            }

        }
        return false;

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        String input[] = new String[loop];
        for (int i = 0; i < input.length; i++) {
            input[i] = sc.next();
        }
        String start = sc.next();
        boolean c = true;
        for (String ans : input) {

            if (check(ans, start)) {
                System.out.print(ans + " ");
               
               c = false;
            }

        }
        if (c) {
            System.out.println("none");
            
        }

    }
}
