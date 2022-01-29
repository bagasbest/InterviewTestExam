import java.util.Scanner;

public class CloudClimber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] clouds = new int[n];

        for(int i=0; i<n; i++){
            clouds[i] = in.nextInt();
        }

        int count = 0;
        for(int i=0; i<n; i++) {
            if(i+2 >= n) {
                if(i+1 <n && clouds[i+1] == 0) {
                    count++;
                }
                break;
            }
            else if(clouds[i+2] == 0) {
                i+=1;
                count++;
            } else if (clouds[i+2] == 1 && clouds[i+1] == 0) {
                count++;
            }
            else if(clouds[i+2] == 1 && clouds[i+1] == 1) {
                break;
            }
        }

        System.out.println(count);
    }

}
