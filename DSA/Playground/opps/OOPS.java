package DSA.Playground.opps;

class pen {

  String color;
  String Type;

  public void write() {
    System.out.println("Writting Somthing");
  }

  public void printColor() {
    System.out.println(this.color);
  }
}

class Student {

  String name;
  int age;

  public void printInfo() {
    System.out.println(this.name);
    System.out.println(this.age);
  }

  Student() {
    System.out.println("Constructor callar");
  }

  Student(String name, int age) {
    this.name = name;
    this.age = age;
  }
  //        Student(Studant s1){
  //            this.name=s1.name;
  //            this.age= s1.age;
  //        }
}

public class OOPS {

  public static void main(String[] args) {
    //        pen pen1= new pen();
    //        pen1.color="blue";
    //        pen1.Type="gel";
    //
    //        pen pen2=new pen();
    //        pen2.color="black";
    //        pen2.Type="bollpoint";
    //
    //        pen1.printColor();
    //        pen2.printColor();
    //        Student s1= new Student();
    //        s1.name="Sanket";
    //        s1.age=23;
    //
    //        s1.printInfo();
    //        Student s1= new Student("Sanket",23);
    //        s1.printInfo();
    //        Student s1= new Student();
    //        s1.name="aman";
    //        s1.age=24;
    //
    //        Student s2=new Student(s1);
    //        s2.printInfo();
  }
}
