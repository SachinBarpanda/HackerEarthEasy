import java.io.*;

class i {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));  
        int T = Integer.parseInt(reader.readLine());
        while(T>0){
            int n = Integer.parseInt(reader.readLine());
            int count = 0;
            String s  = reader.readLine();
            while(n>0){
                if(s.charAt(n-1)=='0'){
                    count++;
                }
                n--;
            }
            System.out.println(count);
            T--;
        }
    }  
}
