import java.io.*;

class l {
    public static void main(String[] args)throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
        int T = Integer.parseInt(reader.readLine());

        while(T>0){
            long n = Long.parseLong(reader.readLine());
            System.out.println(isPossible(n));
            T--;
        }
    }
    static String isPossible(long n){
        if(n==1) return "Yes";

        if(tenTwenty(n,1L)){
            return"Yes";
        } 
        else {
            return "No";
        }
    }

    static boolean tenTwenty(long cur,long n){
        if(cur==n) return true;

        if(cur<n) return false;

        return tenTwenty(cur,n*10) || tenTwenty(cur,n*20);
    }
}