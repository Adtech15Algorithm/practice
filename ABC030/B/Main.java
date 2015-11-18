import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        float hourDegree = (float)(n % 12) / 12 * 360 + (float)m / 60 * 30;
        float minuteDegree = (float)m / 60 * 360;
        float degree = Math.abs(hourDegree - minuteDegree);

        System.out.println(degree > 180 ? 360 - degree : degree);
    }
}
