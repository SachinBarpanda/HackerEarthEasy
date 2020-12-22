import java.io.*;

class g {
    public static void main(String[] args)throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        Long t = Long.parseLong(reader.readLine());
        
        while(t>0){
            Long ans = 0L ;
            Long n = Long.parseLong(reader.readLine());
            int i=1;
            while(i<=Math.sqrt(n)){
                i = i * 2;
                if(n/i>=i/2){
                    ans = n-n/i;
                }else{
                    ans = (n-(i/2)+1);
                }
            }
            System.out.println(ans);

            t--;
        }
        
    }    
}
