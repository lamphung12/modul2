import java.util.Scanner;

public class chia5 {
    public static void main(String[] args) {
        int n;
        int sum=0;
        Scanner so =new Scanner(System.in);
        System.out.println("Nhap vao so nguyen n");
        n=so.nextInt();
        for(int i=0;i<n;i++){
            if(i%5==0 ){
                sum=sum+i;
            }
        }
        System.out.println(" Tong cac so tu 0 den n : "+sum);
    }
}
