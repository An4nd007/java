import java.util.Scanner;
public class Shapes
{
    void area(int r1)
    {
        System.out.println("\n area of circle with radius"+r1+"="+3.14*r1*r1);
    }
    void area (int l1,int b1)
    {
        System.out.println("\n area of rectangle with dimensions"+l1+"x"+b1+"="+l1*b1);
    }
    void area(int l2,int b2,int h2)
    {
        System.out.println("\n area of cuboid with dimensions"+l2+"x"+b2+"x"+h2+"="+l2*b2*h2);
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the length");
        int l=s.nextInt();
        System.out.println("enter the breadth");
        int b=s.nextInt();
        System.out.println("enter the height");
        int h=s.nextInt();
        System.out.println("enter the radius");
        int r=s.nextInt();
        Shapes ob=new Shapes();
        ob.area(r);
        ob.area(l,b);
        ob.area(l,b,h);
    }
    }
