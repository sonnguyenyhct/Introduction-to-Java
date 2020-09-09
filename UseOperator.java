import java.util.Scanner;

public class UseOperator {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chieu cao : ");
        height = scanner.nextFloat();
        System.out.println("Nhap vao chieu rong : ");
        width = scanner.nextFloat();
        System.out.println("Dien tich la : " + width*height);
    }
}
