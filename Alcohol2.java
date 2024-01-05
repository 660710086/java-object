import java.util.Scanner;

public class Alcohol2 {

    public void printValues (int c , int v , int Nc, int Nv){

        int Vol = (Nc * Nv) / c;
      
        if (c < Nc) {
            System.out.println(Nc + " more than "+c);

        } else{
            System.out.println(Vol + " " + (Nv - Vol));
            if (v < Vol) {
                System.out.println("NO");
                
            }else{
                System.out.println("OK");
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Alcohol2 Alc = new Alcohol2();
        int con = sc.nextInt();
        int vol = sc.nextInt();
        int type = sc.nextInt();
        int Ncon = sc.nextInt();
        int Nvol = sc.nextInt();
        Alc.printValues(con,vol,Ncon,Nvol);
        

    }
    
}
