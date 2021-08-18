class Student{
    String name;
    int roll;
    float marks;

    void display(){
        System.out.println("Name of the Student:" + name);
        System.out.println("Roll Number of the Student:" + roll);
        System.out.println("Marks of the Student:" + marks);

    }
}
class Input{
    public static void main(String[] args){
        Student obj1 = new Student();
        Student obj2 = new Student();
        obj1.name = "Sourabh";
        obj1.roll = 17;
        obj1.marks = 71; 
        obj2.name = "Krishna";
        obj2.roll = 14;
        obj2.marks = 90;
        obj1.display(); 
        obj2.display();
    }
}