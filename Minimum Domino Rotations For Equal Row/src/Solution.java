public class Solution {

    public static int minDominoRotations(int[] A, int[] B) {
        int min = 20000;
        for(int i = 0, a = 0, b = 0; i < A.length && (A[i] == A[0] || B[i] == A[0]); i++) {
            if(A[i] == A[0]) {
                a++;
            }
            if (B[i] == A[0]) {
                b++;
            }
            if(i == A.length - 1) {
                min = Math.min(A.length - a, A.length - b);
            }
        }
        for(int i = 0, a = 0, b = 0; i < A.length && (A[i] == B[0] || B[i] == B[0]); i++) {
            if(A[i] == B[0]) {
                a++;
            }
            if (B[i] == B[0]) {
                b++;
            }
            if(i == A.length - 1) {
                min = Math.min(Math.min(A.length - a, A.length - b), min);
            }
        }
        if(min != 20000) {
            return min;
        }
        return -1;
    }

    public static void main(String []args) {
        int[] A = {1,2,1,1,1,2,2,2};
        int[] B = {2,1,2,2,2,2,2,2};
        int res = minDominoRotations(A, B);
        System.out.println(res);
    }

}
