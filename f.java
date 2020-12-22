import java.io.*;
class f {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Long km = Long.parseLong(reader.readLine());
        Long oc= 0L ,of=0L, od= 0L;
        Long cs= 0L, cb = 0L, cm = 0L, cd = 0L;
        String[] l1 = reader.readLine().split(" ");
        String[] l2 = reader.readLine().split(" ");
        for (int i = 0; i < l1.length; i++) {
            oc = Long.parseLong(l1[0]); 
            of = Long.parseLong(l1[1]); 
            od = Long.parseLong(l1[2]); 
        }
        for (int i = 0; i < l2.length; i++) {
            cs = Long.parseLong(l2[0]); 
            cb = Long.parseLong(l2[1]); 
            cm = Long.parseLong(l2[2]); 
            cd = Long.parseLong(l2[3]);
        }
        Long costOnline = (oc)+((km-of)*od);
        Long timeClassic = km/cs;
        Long classicCost = cb+(timeClassic*cm)+km*cd;

        // System.out.println(costOnline + " "+ classicCost);  
        if(costOnline> classicCost){
            System.out.println("Classic Taxi");
        }  else if(classicCost > costOnline){
            System.out.println("Online Taxi");
        }
        else{
            System.out.println("Online Taxi");
        }
    }
}