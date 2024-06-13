package mac_dinh_sx_tangdan;

import java.util.Arrays;

public class MangSoNguyen {
    public static void main(String[] args) {
        Integer[] list = {1,2,5,3,4,5,2,4,5,45,5};

        Arrays.sort(list);

        System.out.println("Mang sap xep: ");
        for(Integer i : list){
            System.out.print(i+"\t");
        }
        System.out.println();
//        System.out.println("In nguoc lai: ");
//        for(int i = list.length-1;i>=0;i--){
//            System.out.print(list[i]+"\t");
//        }
        Arrays.sort(list, new IntegerComparator());
        System.out.println("\nMang sap xep giam dan: ");
        for(Integer i : list){
            System.out.print(i+"\t");
        }
    }
}
