public class ten_Sntdau {
    public static void main(String[] args) {
        int count = 0;
        int status=1;
        int number=3;
        System.out.println("20 số nguyên tố đầu tiên là:");
        System.out.println(1);
        System.out.println(2);

        for ( int i = 2 ; i <=20 ;  ) {
            for (int j = 2; j <= Math.sqrt(number); j++) {
                if (number % j == 0) {
                    status = 0;
                    break;
                }
            }
            if (status != 0) {
                System.out.println(number);
                i++;
                count++;
            }
            status = 1;
            number++;
        }
    }
}
