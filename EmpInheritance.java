import java.util.Scanner;

class Employee {
    int empid;
    String name, address;
    double salary;

    Employee(int no, String na, double sal, String addr) {
        empid = no;
        name = na;
        salary = sal;
        address = addr;
    }
}

class Teacher extends Employee {
    String dept;
    String subject;

    Teacher(int no, String na, double sal, String addr, String dep, String sub) {
        super(no, na, sal, addr); 
        dept = dep;
        subject = sub;
    }

    void display() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
        System.out.println("Department: " + dept);
        System.out.println("Subject: " + subject);
    }
}

class EmpInheritance {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of Employees:");
        int num = s.nextInt();
        s.nextLine(); 

        Teacher[] arr = new Teacher[num];

        for (int i = 0; i < num; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.println("ID, Name, Salary, Address, Department, Subject:");

            int empid = s.nextInt();
            s.nextLine(); 
            String name = s.nextLine();
            double salary = s.nextDouble();
            s.nextLine(); 
            String address = s.nextLine();
            String dept = s.nextLine();
            String subject = s.nextLine();

            arr[i] = new Teacher(empid, name, salary, address, dept, subject);
        }

        System.out.println("\n**** Information of all the Employees ****");
        for (int i = 0; i < num; i++) {
            System.out.println("\nEmployee " + (i + 1) + " details:");
            System.out.println("-----------------------------");
            arr[i].display();
        }
        s.close();
    }
}
