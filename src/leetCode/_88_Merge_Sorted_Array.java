package leetCode;

public class _88_Merge_Sorted_Array {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int ai : nums2){
            chenPhanTuVaoMang(ai, nums1, m);
            m++;
        }

    }

    public static void chenPhanTuVaoMang(int ai, int[] nums1, int m) {
        boolean check = false;
        for (int i = 0; i < m; i++) {
            if(nums1[i] > ai){
                check = true;

                //lui phan tu trong mang
                for (int j = m-1; j>=i ; j--){
                    nums1[j+1] =  nums1[j];
                }
                nums1[i] = ai;
                break;
            }

        }
        if(!check){
            nums1[m] = ai;
        }
    }

    public static void main(String[] args) {
    int[] nums1 = {1, 2, 3, 0, 0, 0};
    int[] nums2 = {2, 5, 6};
    merge(nums1, 3, nums2, 3);
    for(int i : nums1){
        System.out.println(i);
    }
    }

}
