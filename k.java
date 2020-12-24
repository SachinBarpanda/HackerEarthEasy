import java.io.*;
import java.util.LinkedList;
import java.util.Queue;


class k {
    public static void main(String[] args)throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
        int T = Integer.parseInt(reader.readLine());
        String s = reader.readLine();
        int count = 0;
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < T; i++) {
            q.add(i);
        }
        System.out.println(eliminate(T, q, s, count)+1);
    }
    static int eliminate(int T,Queue<Integer> q,String s, int count){
        if(q.size() == 1){
            return q.element();
        }
        if(count==s.length()) count=0;

        if(s.charAt(count)=='y'){
            q.poll();
            return eliminate(T, q, s, count+1);
        }else if(s.charAt(count)=='x'){
            q.add(q.poll());
            return eliminate(T, q, s, count+1);
        }
        return q.element();

        //return eliminate(T, q, s, count);
    }

    
}
