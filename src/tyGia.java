import java.util.Scanner;
public class tyGia {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap gia tri");
        int main=23000;
        int usd=sc.nextInt();
        double vnd= (double ) (usd/main);
        System.out.println("Tri gia USD: "+ vnd);
    }
}
