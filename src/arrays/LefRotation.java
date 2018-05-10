package arrays;

public class LefRotation {

    /**
     * When we perform d = 4 left rotations, the array undergoes the following sequence of changes:
     * [1, 2, 3, 4, 5] -> [2, 3, 4, 5, 1] -> [3, 4, 5, 1, 2] -> [4, 5, 1, 2, 3] -> [5, 1, 2, 3, 4]
     * */

    static int[] leftRotate(int[] arr, int d) {

        for (int i = 0; i < d; i++) {
            int temp = arr[0];

            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }

            arr[arr.length - 1] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int[] leftRotated = leftRotate(arr, 2);

        String res = "";
        for (int a : leftRotated) {
            res += a + " ";
        }

        System.out.println(res.trim());


    }

}
