import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số tiền quy đổi");
        double money = scanner.nextDouble();
        System.out.println("so tien sau khi quy doi " + money + " usd bằng " + money * 23000 + " vnD");
    }
}
