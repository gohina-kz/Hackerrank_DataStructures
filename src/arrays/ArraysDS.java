package arrays;

public class ArraysDS {

    /**
     * Print all N integers in reverse order as a single line of space-separated integers.
     * 1 4 3 2 => 2 3 4 1
     * */

    static int[] reverseArray(int[] a) {

        for (int i = 0; i < a.length / 2; i++) {

          int temp = a[i];
          a[i] = a[a.length - i - 1];
          a[a.length - i - 1] = temp;

        }

        return a;
    }

    public static void main(String[] arg) {
        int[] a = {1, 4, 3, 2};
        int[] reversed = reverseArray(a);


        String ans = "";
        for (int i = 0; i < reversed.length; i++) {
            ans += reversed[i] + " ";
        }

        System.out.print(ans.trim());
    }

}
