import java.io.*;
import java.math.BigInteger;

class c {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        try {
            while ((s = reader.readLine()) != "\n") {
                String[] s1 = s.split(" ");
                if (s.equals(null)) {
                    return;
                }
                BigInteger a = new BigInteger(s1[0]);
                BigInteger b = new BigInteger(s1[1]);

                System.out.println(a.add(b));
            }
        } catch (Exception e) {

        }

    }
}
