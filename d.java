import java.io.*;

class d {
    public static void main(String[] args)throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[10];
        String s = reader.readLine();

        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i)-'0']++;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(i+" "+a[i]);
        }
    }    
}
