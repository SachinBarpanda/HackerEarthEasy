import java.io.*;
import java.util.HashMap;
 
// import jdk.internal.jline.internal.InputStreamReader;
 
class a {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Long t = Long.parseLong(reader.readLine());
        
        String[] s = reader.readLine().split(" ");
        Long[] a = new Long[s.length];
        for (int i = 0; i < s.length; i++) {
            a[i] = Long.parseLong(s[i]);
        }
        HashMap<Long, Long> map = new HashMap<Long, Long>();
        for (int i = 0; i < t; i++) {
            map.put((long) (a[i] + Math.pow((i + 1), 2)), 0L);
            // map.put((long) (a[i] + Math.pow((i + 1), 2)), 0L);
        }
 
        for (int i = 0; i < t; i++) {
            if(map.get((long) (a[i] - Math.pow((i + 1), 2)))!=null)
            map.put((long) (a[i] - Math.pow((i + 1), 2)), map.get((long) (a[i] - Math.pow((i + 1), 2))) + 1L);
        }
        long res = 0;
        for (long x : map.values()) {
            long cnt = x;
            res +=  cnt;
        }
        System.out.println(res);
    }
}