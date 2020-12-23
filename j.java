
import java.io.*;
import java.util.Map;
import java.util.TreeMap;

class j {
    public static void main(String[] args)throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));  
        int T = Integer.parseInt(reader.readLine());
        String[]s = reader.readLine().split(" ");
        Map<Integer, Boolean> m = new TreeMap<>();
        int a ;
        for (int i = 0; i < T; i++) {
            a = Integer.parseInt(s[i]);

            if(m.containsKey(a)){
                m.put(a, false);
            }else{
                m.put(a,true);
            }
        }
        for (Integer a1 : m.keySet()){
            if(m.get(a1)){
                System.out.print(a1+" ");
            }
        }
    }    
}
