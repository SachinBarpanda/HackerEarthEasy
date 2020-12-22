import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class a{
    public static void main(String[] args)throws IOException {
        boolean possible = true;
        int conz = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[]s = reader.readLine().split("");
        StringBuilder builder = new StringBuilder("");
        for (int i = 0; i < n; i++) {
            if(s[i].equals("H")){
                conz++;
                    if(conz<=1){
                        builder.append("H");
                        possible = true;
                    }
                    else{
                        possible = false;
                        break;
                    }
            }else if(s[i].equals(".")){
                    conz=0;
                    builder.append("B");
            }
        }
        if(possible){
            System.out.println("YES");
            System.out.print(builder);
        }else{
            System.out.print("NO");
        }  
    }
}