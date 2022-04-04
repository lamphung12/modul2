import java.util.Scanner;

public class nhan {
    public static void main(String[] args) {
        int a;
        int tich;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap gia tri can nhan: ");
        a= sc.nextInt();
        for (int i=1;i<20; i++) {
            tich = a*i;
            System.out.printf("%d * %d = %d \n", a, i, tich);
        }
    }




}
