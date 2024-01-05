import java.util.Scanner;

public class Alcohol1 {

    public void printlnof(int C, int V, int T) {

        if (C < 0) {
            C = 0;
            System.out.println("invalid concentration");

        }
        if (V < 0) {
            V = 0;
            System.out.println("invalid volume");

        }

        if (T == 0) {

            System.out.println("Methyl Alcohol " + C + "% " + V + "ml.");

        } else if (T == 1) {

            System.out.println("Ethyl Alcohol " + C + "% " + V + "ml.");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Alcohol1 Alc = new Alcohol1();
        int concentration = sc.nextInt();
        int volume = sc.nextInt();
        int type = sc.nextInt();
        Alc.printlnof(concentration, volume, type);

    }

}
