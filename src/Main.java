import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    double fnum, snum, answer;
        System.out.println("Enter first nuber:");
        fnum = scn.nextDouble();
        System.out.println("Enter second number:");
        snum = scn.nextDouble();
        answer = fnum + snum;
        System.out.println("Equals to:" + (int) answer);

    }
}