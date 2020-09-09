import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        int month;
        String daysInMonth;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao thang : ");
        month = scanner.nextInt();
        switch (month){
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                daysInMonth = "31";
                break;
            case 2 :
                daysInMonth = "28 hoac 29";
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                daysInMonth = "30";
                break;
            default :
                daysInMonth = "";
        }
        if (!daysInMonth.equals("")){
            System.out.printf("Thang '%d' co %s days!", month, daysInMonth);
        }else {
            System.out.print("Nhap sai thang");
        }
    }
}
