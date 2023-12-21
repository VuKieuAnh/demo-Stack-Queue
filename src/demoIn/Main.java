package demoIn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
//        int a =100;
//        int b=9;
        User user = new User();
        User user1 = new User();
//        sap xep -> so sanh 2 doi tuong
//        cung cap tieu chi de so sanh 2 doi tuong
        ArrayList<User> userArrayList = new ArrayList<>();
        userArrayList.add(new User("Phong", 23, 70, 183));
        userArrayList.add(new User("Toan", 20, 68, 173));
        userArrayList.add(new User("Khoa", 22, 63, 168));
        Collections.sort(userArrayList);
//        sap sep theo tuoi
        System.out.println(userArrayList);

        System.out.println("Sap xep theo can nang");
//        trien khai interface
//        interface abstract
//        trien khai luon phuonhg thuc
//        Lop nac danh Anonymous Class
//        tao doi tuong truc tiep tu Interface
//        Chi dung mang tinh thoi diem, ko lam anh huong den he thong va class da co
        Comparator<User> comparator = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.weight - o2.weight;
            }
        };
        Collections.sort(userArrayList, comparator);
        System.out.println(userArrayList);
    }
}
