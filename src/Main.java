import java.util.ArrayList;
import java.util.Random;

public class Main {
// How many heads in the array need to be reversed for all coins to show heads.
     int[] A = {29, 1,0, 0,1,0,1, -2, 101};
     int N; // within the range 0 and 100
     int headcounter = 0, tailcounter = 0;

     public Main(){
         N = A.length;
        try {
           headcounter =  headCount(A);
           N = trueNumberOfHeadsAndTails(A);
           tailcounter = N - headcounter;
        }catch(Exception e){
            System.out.println(e.getLocalizedMessage());
        }

        System.out.println(tailcounter);

     }

    public static void main(String[] args) {
        Main main = new Main();
    }

    // Number of heads in the array
    public static int headCount(int[] A){
    int  N = A.length;// within the range 0 and 100
    int headcounter = 0;
     if (N <= 100 && N >= 0) {
         int heads = 0;
         for (int i : A) {
             if (i == heads) {
                 headcounter++;
             }
         }
     }return headcounter;
    }

    //selects only true heads and tails in the array and counts them
    public static int trueNumberOfHeadsAndTails(int[] A){
        int heads = 0, tails = 1, N = A.length;// within the range 0 and 100;
         for(int i : A) {
            if (i != tails && i != heads)
                N--;
        }
        return N;
    }

}
