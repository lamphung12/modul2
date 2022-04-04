import java.util.Scanner;

public class tamgiac {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao a");
        a=scanner.nextInt();
        System.out.println("Nhap vao b");
        b=scanner.nextInt();
        System.out.println("Nhap vao c");
        c=scanner.nextInt();
        if (a + b > c && b + c > a && c + a > b){
            System.out.println("Đó là 3 cạnh của 1 tam giác");
        }
        if(a*a==b*b+c*c || b*b==a*a+c*c|| c*c==a*a+b*b) {
            System.out.println(" Do la tam giac vuong");
        }
    }
}
