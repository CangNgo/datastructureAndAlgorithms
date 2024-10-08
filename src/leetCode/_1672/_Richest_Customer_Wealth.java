package leetCode._1672;

public class _Richest_Customer_Wealth {
    public static int maximumWealth(int[][] a) {
        int max = 0;
        int soHang = a.length;
        int soCot = a[0].length;
        for (int i = 0; i < soHang; i++) {
            int tongTien = 0;
            for (int j = 0; j < soCot; j++) {
                tongTien += a[i][j];
            }
            max = Math.max(max, tongTien);
        }
        return max;
    }

    public static void main(String[] args) {
//        int[][] a = { {1,2,3},{3,2,1}};
//        System.out.println(maximumWealth(a));


        String t = "T";
        for (int i = 1; i < 11; i++) {
           for (int j = 1; j < 17; j++) {
               if(i == 2 || i ==3 || i ==8 || i ==10){
                   if(j <=9){
                       String roomNumber = "0";
                       System.out.println("(now(), 1, \" "+ t + i + roomNumber +j + " (Nhà T)"+ "\", \"\", 1 , 1),");
                   }else{
                       System.out.println("(now(), 1, \" "+ t + i +j + " (Nhà T)"+ "\", \"\", 1 , 1),");
                   }
               }
           }

        }
    }
}
