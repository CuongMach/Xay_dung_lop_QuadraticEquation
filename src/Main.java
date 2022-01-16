import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        quadraticEquation.setA(scanner.nextDouble());
        System.out.println("Nhập số b: ");
        quadraticEquation.setB(scanner.nextDouble());
        System.out.println("Nhập số c: ");
        quadraticEquation.setC(scanner.nextDouble());

        double index = quadraticEquation.getDiscriminant();

        if (index < 0) {
            System.out.println("The equation has no roots");
        } else if (index == 0) {
            System.out.println("Nghiệm của phương trình là: " + quadraticEquation.getRoot1());
        } else {
            System.out.println("Nghiệm của phương trình là: " + quadraticEquation.getRoot1() + ", " + quadraticEquation.getRoot2());
        }
    }
}
