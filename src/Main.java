import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxDivisible = 0;
        int maxUocChung = 0;

        System.out.printf("Nhap vao so a: ");
        int a = input.nextInt();

        System.out.printf("Nhap vao so b: ");
        int b = input.nextInt();

       if (a == 0){
           if(b != 0){
               maxUocChung = Math.abs(b);
               System.out.printf("Uoc chung lon nhat: %d", maxUocChung);
           }else {
               System.out.printf("Khong co uoc chung");
           }
       }

        if (b == 0){
            if(a != 0){
                maxUocChung = Math.abs(a);
                System.out.printf("Uoc chung lon nhat: %d", maxUocChung);
            }else {
                System.out.printf("Khong co uoc chung");
            }
        }

        if(a != 0 && b != 0){
            if(Math.abs(a) > Math.abs(b)){
                maxDivisible = Math.abs(b);
            }
            if(Math.abs(a) < Math.abs(b)){
                maxDivisible = Math.abs(a);
            }
            for (int i = 1; i <= maxDivisible; i++) {
                if (a % i == 0 && b % i == 0) {
                    maxUocChung = i;
                }
            }
            if(maxUocChung != 0){
                System.out.printf("Uoc chung lon nhat: %d", maxUocChung);
            } else {
                System.out.printf("Khong co uoc chung");
            }
        }


    }
}