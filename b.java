import java.io.*;


class b {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        
        for (int i = 0; i < n; i++) {
            int count = 0;
            String[] s1 = reader.readLine().split("");
            String[] s2 = reader.readLine().split("");
            int[] a = new int[26] ;
            for (int j = 0; j < s1.length; j++) {
                a[s1[j].charAt(0) - 'a']++;
            }
            for (int j = 0; j < s2.length; j++) {
                a[s2[j].charAt(0) - 'a']--;
            }
            for (int j = 0; j < a.length; j++) {
                count += Math.abs(a[j]);
            }
            System.out.println(count);
        }

    }
}
