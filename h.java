import java.io.*;

class h {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s ; Long prev = 0L, prevCount = 0L;
        try{
            while((s = reader.readLine()) != "\n"){
                Long n = Long.parseLong(s);
                
                if(prev==n){
                    System.out.println(prevCount);
                }else{
                    Long count = 0L;
                    while(n>0){
                        count += n&1;
                        n>>=1;
                    }
                    System.out.println(count);
                    prev = n;
                    prevCount = count;
                }
            }
        }catch(Exception e){

        }
       
    }
    
}
