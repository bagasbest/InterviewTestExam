import java.util.Scanner;

public class StringRepetition {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();

        long count = 0;
        for(int i = 0 ; i<s.length(); i++) {
            if(s.charAt(i) == 'a') {
                count++;
            }
        }
        long factor = n/s.length();
        long characterLeft = n%s.length();
        count = count * factor;
        for(int i = 0; i<characterLeft; i++) {
            if(s.charAt(i) == 'a') {
                count++;
            }
        }

        System.out.println(count);

    }

}
