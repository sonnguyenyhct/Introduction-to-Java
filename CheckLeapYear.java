import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        int year;
        boolean isLeapYear;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao nam");
        year = scanner.nextInt();

        if (year%100 == 0){
            isLeapYear = year % 400 == 0;
        }else isLeapYear = year % 4 == 0;

        if (isLeapYear){
            System.out.println("Nam " + year + " la nam nhuan");
        }else {
            System.out.println("Nam " + year + " khong phai nam nhuan");
        }
    }
}
