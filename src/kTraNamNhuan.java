import java.util.Scanner;
public class kTraNamNhuan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap nam can kiem tra : ");
        int nam= sc.nextInt();
        if(nam % 4==0 ){
            if(nam % 100==0){
                if(nam % 400==0){
                    System.out.println(nam+"Nam do la nam nhuan");
                }else{
                    System.out.println(nam+" Nam do ko phai nam nhuan");
                }
            }else{
                System.out.println(nam+"nam do la nam nhuan");
            }
        }else{
            System.out.println(nam+"nam do ko phai nam nhuan");
        }

    }
}
