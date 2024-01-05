import java.util.Scanner;

public class Stringextremum2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        String one = sc.next();
        String two = sc.next();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String Sget = "";
        sc.nextLine();

        for (;;)
        {
            String word = sc.nextLine();

            if (word.length() == 0)
            {
                if (start == 1)
                {
                    System.out.println(max);
                    System.out.println(Sget);
                }
                else if (start == 2)
                {
                    System.out.println(min);
                    System.out.println(Sget); 
                }
                sc.close();
                break;
            }
            else
            {
                if (start == 1 && (word.indexOf(one) > -1 || word.indexOf(two) > -1))
                {
                    if (word.length() >= max)
                    {
                        max = word.length();
                        Sget = word;
                    }
                }
                else if (start == 2 && (word.indexOf(one) > -1 || word.indexOf(two) > -1))
                {
                    if (word.length() <= min)
                    {
                        min = word.length();
                        Sget = word;
                    }
                }
            }
        }
     }
}
