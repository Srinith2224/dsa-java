package bigo;

public class BigOLab {

    // O(1) — Return the element at index 5 of arr
    static int constantTime(int[] arr) {
        return arr[5];
    }

    // O(n) — Find the maximum element in arr
    static int linearTime(int[] arr) {
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]> max){
                max = arr[i];
            }
        }
        return max;
    }

    // O(n²) — Print every pair (i, j) where i and j are elements of arr
    static void quadraticTime(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i] + "," + arr[j] + " ");
            }
            System.out.println();
        }
    }

    // O(log n) — Count how many times you can halve n before it becomes 1
    static int logarithmicTime(int n) {
        int count =0;
        while(n>1){
            n = n/2;
            count++;
        }
        return count;
    }

    // O(n²) space — Create and return an n × n 2D array where matrix[i][j] = i + j
    static int[][] quadraticSpace(int n) {
        int[][] matrix = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = i + j;
            }
        }
        return matrix;


    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 12, 3, 7, 9, 4, 11, 6};

        System.out.println("constantTime: " + constantTime(arr));
        System.out.println("linearTime: " + linearTime(arr));
        System.out.print("quadraticTime: ");
        quadraticTime(arr);
        System.out.println();
        System.out.println("logarithmicTime(1024): " + logarithmicTime(1024));
        System.out.println("quadraticSpace(3):");
        int[][] m = quadraticSpace(3);
        for (int[] row : m) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }
    }
}