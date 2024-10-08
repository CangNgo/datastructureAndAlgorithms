package leetCode;

import java.text.SimpleDateFormat;

public class _27_Remove_Element {

    //2 con tro
    public static int removeElement2(int[] nums, int val){
        int k = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] != val) {
                nums[k]   = nums[i];
                k++;
            }
        }
        return k;
    }


    public static int removeElement(int[] nums, int val) {
        int length = nums.length;
        for (int i = 0; i < length;) {
            if (nums[i] == val){
                //xoa phan tu
                for (int j = i ; j <=  (length -2) ; j++ ) {
                    nums[j] = nums[j+1];
                }
                length--;
            }else{
                i++;
            }
        }
        return length;
    }

    public static void main(String[] args) {

        int[] nums = {3,2,2,3,4};
        int count = removeElement2(nums, 3);
        System.out.println(count);
    }
}
