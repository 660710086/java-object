import java.util.Scanner;

public class BgReport {
    static void check(String n, int d, int s) {
        if (n.length() >=2) {
            System.out.println("Name: " + n);

        } else {
            System.out.println("Name: INVALID");
        }

        if (d >= 1900 && d <= 2022) {
            System.out.println("Birth year: " + d);

        } else {
            System.out.println("Birth year: INVALID");
           
        }

        int work = s - d;
        if ((work >= 18 )&&  (s >= 1900 && s <= 2022) &&(d >= 1900 && d <= 2022)) {
            System.out.println("Start year: " + s);
        } else {

            System.out.println("Start year: INVALID");

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
       
        int day = sc.nextInt();
        int start = sc.nextInt();
        check(name, day, start);

    }

}
