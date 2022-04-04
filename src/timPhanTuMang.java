import java.util.Scanner;

public class timPhanTuMang {
    public static void main(String[] args) {
        String[]arr={"Hoc","Phong","Son","Trung"};
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ten hoc sinh");
        String nhap= sc.nextLine();
        for( int i=0;i< arr.length;i++){
            if( arr[i].equals(nhap)){
                System.out.println("Ten hoc sinh la: "+ nhap + " vi tri" + i );
            }
        }
    }
}
