import java.util.Scanner;

public class tong0_n {
    public static void main(String[] args) {
        int n;
        int sum=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap so n");
        n=scanner.nextInt();
        for(int i=0;i<n;i++){
            if(i%2==0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}
