import java.io.*;
import java.util.Arrays;

class e {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        while(n>0){
            String s = reader.readLine();
            
            //anti- palindrome
            if(isPalindrome(s)){
                char[] s1 = s.toCharArray();
                Arrays.sort(s1);
                String r = new String(s1);
                if(r.equals(s)){
                    System.out.println("-1");
                }else{
                    System.out.println(s1);
                }
            }else{
                char[] s1 = s.toCharArray();
                Arrays.sort(s1);
                System.out.println(s1);
            }
            
            n--;
        }
    }    
    public static boolean isPalindrome(String s){
        StringBuffer sb = new StringBuffer(s);
        return sb.reverse().toString().equals(s);
    }
}
