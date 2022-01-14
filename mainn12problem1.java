import java.util.Scanner;

public class mainn12problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks sub1");
        int sub1 = sc.nextInt();
        System.out.println("Enter the marks sub2");
        int sub2 = sc.nextInt();
        System.out.println("Enter the marks sub3");
        int sub3 = sc.nextInt();
        System.out.println("Enter the marks sub4");
        int sub4 = sc.nextInt();
        System.out.println("Enter the marks sub5");
        int sub5 = sc.nextInt();

        Float total = ((sub1+sub2+sub3+sub4+sub5)/500.0f)+100;
        System.out.println(total);

    }
}
