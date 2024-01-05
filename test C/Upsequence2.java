import java.util.Scanner;

public class Upsequence2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        
        for (int i = 0 ; i < word.length() ; i ++)
        {
            if (i == word.length() - 1)
            {
                System.out.println(word.charAt(i));
            }
            else
            {
                if ((int)word.charAt(i) < (int)word.charAt(i+1))
                {
                    System.out.print(word.charAt(i));
                    continue;
                }
                else
                {
                    System.out.println(word.charAt(i));
                }
            }
        }
        sc.close();
    }
}
