import java.util.Scanner;
class Student3{
    String n;
    int r;
    int m;
        void display()
        {
            System.out.println("Student Name: " + n);
            System.out.println("Roll Number: " + r);
            System.out.println("Marks: " + m);
         
        }
        void input()
        {
            Scanner sb = new Scanner(System.in);
            System.out.print("Enter the name: ");
            n = sb.nextLine();
            System.out.print("Enter the Roll number: ");
            r = sb.nextInt();
            System.out.print("Enter the Marks: ");
            m = sb.nextInt();
        }
        public static void main(String[] args) {
            Student3 ob = new Student3();
            ob.input();
            ob.display(); 
        }
}