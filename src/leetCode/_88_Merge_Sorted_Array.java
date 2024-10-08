package leetCode;

public class _88_Merge_Sorted_Array {

    //2 con tro
    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = (m + n) - 1;
        int length = (m + n) - 1;
        for (int l = length; l >= length; --length) {
            if (i < 0 && j < 0) {
                break;
            }
            if (i < 0) {
                nums1[k] = nums2[j];
                j--;
            } else if (j < 0) {
                nums1[k] = nums1[i];
                i--;
            } else if (nums1[i] > nums2[j])  {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int ai : nums2) {
            chenPhanTuVaoMang(ai, nums1, m);
            m++;
        }
    }

    public static void chenPhanTuVaoMang(int ai, int[] nums1, int m) {
        boolean check = false;
        for (int i = 0; i < m; i++) {
            if (nums1[i] > ai) {
                check = true;

                //lui phan tu trong mang
                for (int j = m - 1; j >= i; j--) {
                    nums1[j + 1] = nums1[j];
                }
                nums1[i] = ai;
                break;
            }

        }
        if (!check) {
            nums1[m] = ai;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0,0};
        int[] nums2 = {2, 5, 6,1};
        merge2(nums1, 3, nums2, 4);
        for (int i : nums1) {
            System.out.println(i);
        }
    }

}
