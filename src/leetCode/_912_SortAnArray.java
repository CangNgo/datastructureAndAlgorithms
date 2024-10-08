package leetCode;

import java.util.Arrays;

public class _912_SortAnArray {
    public int[] merge(int[] a1 , int[] a2){
        int n = a1.length + a2.length;
        int[] result = new int[n];

        int i = 0;
        int i1 = 0;
        int i2 = 0;

        while (i < n) {
            if (i1 < a1.length && i2 < a2.length) {
                if (a1[i1] <= a2[i2]) {

                    result[i] = a1[i1];
                    i++;
                    i1++;
                } else {
                    result[i] = a2[i2];
                    i++;
                    i2++;
                }
            } else { //a1 rong hoac a2 rong
                if (i1 < a1.length) { // a2 rong
                    result[i] = a1[i1];
                    i++;
                    i1++;
                } else { //a1 rong
                    result[i] = a2[i2];
                    i++;
                    i2++;
                }
            }
        }

        return result;
    }

    public int[] mergeSort(int[] a, int L, int R) {

        if (L > R) return new int[0];
        if (L == R) {
            return new int[]{a[L]};
        }

        System.out.println("Chia " + L + " - " + R);
        int K = (L + R) / 2;
//        chia ra
        int[] a1 = mergeSort(a, L, K);
        int[] a2 = mergeSort(a, K + 1, R);

//        trộn vào
        int[] result =  merge(a1, a2 );
        System.out.println("merge " + Arrays.toString(result));
        return result;
    }

    public static void main(String[] args) {

        int[] a1 = {1,5,3,2,8,7,6,4};
        _912_SortAnArray sol = new _912_SortAnArray();
        int[] result = sol.mergeSort(a1,0, a1.length-1);
        System.out.println(Arrays.toString(result));
    }
}
