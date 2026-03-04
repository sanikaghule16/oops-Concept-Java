import java.util.Scanner;

class Student {
    int rollNo;
    String name;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();

        System.out.print("Enter Roll No: ");
        s1.rollNo = sc.nextInt();

        System.out.print("Enter Name: ");
        s1.name = sc.next();

        System.out.println("\nStudent Details:");
        System.out.println("Roll No: " + s1.rollNo);
        System.out.println("Name: " + s1.name);

        sc.close();
    }
}
