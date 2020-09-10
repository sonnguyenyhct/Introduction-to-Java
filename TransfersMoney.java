import java.util.Scanner;

public class TransfersMoney {
    public static void main(String[] args) {
        int rate = 23000;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao USD : ");
        int usd = scanner.nextInt();
        int vnd = usd*rate;
        System.out.println(vnd);
    }
}
