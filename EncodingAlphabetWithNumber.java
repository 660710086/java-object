import java.util.Scanner;

public class EncodingAlphabetWithNumber {

    public void ans (String s , int arr[]){
        for(int i = 0 ;i < s.length() ; i++){
            int num = (int)s.charAt(i);
            if (num + arr[i] <= 'Z' ) {
                System.out.print((char)(num+arr[i]));
                
            }else{
                System.out.print((char)(num+arr[i]-26));
            }
        }

    }
    public static void main(String[] args) {
        EncodingAlphabetWithNumber e = new EncodingAlphabetWithNumber();
        Scanner sc = new Scanner(System.in);
        String start = sc.next();
        int start_length = start.length();
        int arr_start[] = new int[start_length];
       
        for (int i = 0; i < start_length; i++) {
            
            arr_start[i] = sc.nextInt();
            
        }
        e.ans(start,arr_start);


    }
    
}
