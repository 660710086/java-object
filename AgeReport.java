import java.util.Scanner;

public class AgeReport {

    static String checkTheAgeAccording(int s,int e,int []h, int [] o){
        int round = 0;
        String resulf = "";
        for (int i = 0; i < o.length; i++) {
            if (s<= o[i] && e >= o[i]) {
                resulf += Integer.toString(h[i]);
                resulf+= "\n";    
                round++;            
            }
            
        }
        resulf +="There are "+Integer.toString(round) + " persons in age range of "+ Integer.toString(s) + " to "+ Integer.toString(e);
        return resulf;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int round= sc.nextInt();
       
        int height[] = new int[round];
       
        int old [] = new int[round];
       
        
        for (int i = 0; i < round; i++) {
            height[i] =  sc.nextInt();
            
            old [i] = sc.nextInt();
        }
        
        int start = sc.nextInt();
        int end = sc.nextInt();

       if (start <= end) {
        System.out.println(checkTheAgeAccording(start,end,height,old));
        
       }
    }
    
}
