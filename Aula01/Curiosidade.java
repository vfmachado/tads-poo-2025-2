
import java.util.Arrays;
import java.util.Random;

public class Curiosidade {
 
    public static void main(String[] args) {
        
        int [] v = new int[1000];
        Random r = new Random();
        for (int i = 0; i < v.length; i++) {
            v[i] = r.nextInt(999999);
        }

        long inicial = System.currentTimeMillis();

        // for (int i = 0; i < v.length; i++) {
        //     for (int j = i+1; j < v.length; j++) {
                
        //         if (v[j] < v[i]) {
        //             int s = v[j];
        //             v[j] = v[i];
        //             v[i] = s;
        //         }

        //     }
        // }
        Arrays.sort(v);

        long tfinal = System.currentTimeMillis();
        System.out.println("LEVOU " + (tfinal - inicial));
        // for (int i = 0; i < v.length; i++) {
        //     System.out.println(v[i]);            
        // }
    }

}
