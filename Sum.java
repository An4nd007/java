import java.util.Scanner;

public class Sum {

    void sum(int x) {
        System.out.println("Sum = " + (x + x));
    }

    void sum(int x, double y) {
        System.out.println("Sum = " + (x + y));
    }

    void sum(int x, int y, int z) {
        System.out.println("Sum = " + (x + y + z));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the first value:");
        int x = s.nextInt();

        System.out.println("Enter the second value:");
        int y = s.nextInt();

        System.out.println("Enter the third value:");
        int z = s.nextInt();

        Sum ob = new Sum();

        ob.sum(x);          
        ob.sum(x, y);       
        ob.sum(x, y, z);

        s.close();
    }
}
