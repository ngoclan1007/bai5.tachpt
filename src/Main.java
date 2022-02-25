import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] name2 = name();
        int[] bai22 = bai2();
    }

    public static String[] name(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập họ tên");
        String name1 = sc.nextLine();
        name1=name1.trim();
        name1= name1.replaceAll("\\s+" ," ");
        String [] temp = name1.split(" ");
        String result="";
        for (int i=0; i< temp.length; i++){
            String s1 = String.valueOf(temp[i].charAt(0)).toUpperCase();
            String s2 = temp[i].substring(1).toLowerCase();
            result += (s1 +s2 + " ");
        }
        System.out.println(result);

        return temp;
    }

    public static int[] bai2(){
        int n;
        System.out.println("nhập số phần tử mảng n: ");
        Scanner sc= new Scanner(System.in);
        n = sc.nextInt();
        int[] mang1 = new int[n];
        for (int i =0; i<n; i++){
            System.out.println("nhập phẩn tử mảng: " + i);
            mang1[i] = sc.nextInt();
        }
//        in mảng
        System.out.println("mảng vừa nhập là ");
        for (int i=0; i<n; i++){
            System.out.println(mang1[i]);
        }

//        Thay đổi các phần tử là số chẵn trong mảng tăng lên 1 đv
        System.out.println("tăng phần tử là số chẵn lên 1 đv");
        for (int i=0; i<n; i++){
            if(mang1[i] % 2 ==0){
                mang1[i]+= 1;
            }
            System.out.println(mang1[i]);
        }

        return mang1;
    }
}
