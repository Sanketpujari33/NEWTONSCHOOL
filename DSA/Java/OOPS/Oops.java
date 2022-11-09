package DSA.Java.OOPS;


    class Student {
        String name;
        int age;

        Student() {
            System.out.println("Constructor called");
        }
        Student(String name, int age) {
            this.name = name;
        }

        Student(Student s2) {
            this.name = s2.name;
            this.age = s2.age;
        }
        public void displayInfo(String name) {
            System.out.println(name);
        }

        public void displayInfo(int age) {
            System.out.println(age);
        }

        public void displayInfo(String name, int age) {
            System.out.println(name);
            System.out.println(age);
        }

            public void getInfo() {
            System.out.println("The name of this Student is " + this.name);
            System.out.println("The age of this Student is " + this.age);
        }
    }
class Pen {
    String color;

    public void printColor() {
        System.out.println("The color of this Pen is " + this.color);
    }
}

public class Oops {
        public static void main(String args[]) {
            Student s1 = new Student();
            s1.name = "Aman";
            s1.age = 24;
            s1.getInfo();

            Student s2 = new Student();
            s2.name = "Shradha";
            s2.age = 22;
            s2.getInfo();



//            Pen p1 = new Pen();
//            p1.color = blue;
//
//            Pen p2 = new Pen();
//            p2.color = black;
//
//            Pen p3 = new Pen();
//            p3.color = red;

//            p1.printColor();
//            p2.printColor();
//            p3.printColor();
        }
}
