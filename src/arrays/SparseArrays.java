package arrays;

public class SparseArrays {

    /**
     * There is a collection of N strings
     * (There can be multiple occurences of a particular string ).
     * Each string's length is no more than 20 characters.
     * There are also Q queries.
     * For each query, you are given a string, and you need to find
     * out how many times this string occurs in the given collection of N strings.
     * */

    static int findSuffix(String[] collections, String queryString) {
        int counter = 0;

        for (int i = 0; i < collections.length; i++) {
            if (collections[i].equals(queryString)) counter++;
        }

        return counter;
    }

    public static void main(String[] args) {

        String[] collections = {"aba", "baba", "aba", "xzxb"};
        String[] query = {"aba", "xzxb", "ab"};

        for (String queryString : query) {
            System.out.println(findSuffix(collections, queryString));
        }

    }
}
