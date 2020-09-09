import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        float a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao a ");
        a = scanner.nextFloat();
        System.out.println("Nhap vao b ");
        b = scanner.nextFloat();
        System.out.println("Nhap vao c ");
        c = scanner.nextFloat();
        if (a == 0){
            if ((c - b) == 0){
                System.out.println("Phuong trinh vo so nghiem");
            }else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }else {
            System.out.println("Phuong trinh co 1 nghiem la " + (c-b)/a);
        }
    }
}
