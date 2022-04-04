import java.util.Scanner;
public class canNang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Nhap can nang");
        int cn= sc.nextInt();
        System.out.println("Nhap chieu cao");
        int cc= sc.nextInt();
      int bmi= cn / cc*cc;
        if(bmi<18.5){
            System.out.println(bmi+"Underweight");
        }
        else if(bmi <25){
            System.out.println(bmi+"Normal");
        }
        else if(bmi<30){
            System.out.println(bmi + "Overweight");
        }
        else if(bmi>30){
            System.out.println(bmi+"Obese");
        }
    }
}
