/*class Student {
    int rollno;
    String name;
    float fee;
    Student(int rollno, String name, float fee)
    {
        this.rollno=rollno;
        this.name=name;
        this.fee=fee;
    }
    void display()
    {
        System.out.println(rollno +" "+name+" "+ fee);
    }

}
class TestThis2
{
    public static void main(String args[]){
        Student s1=new Student(111,"ankit",5000f);
        Student s2=new Student(112,"sumit",6000f);
        s1.display();
        s2.display();
        System.out.println("___________________________________________________");
    }
}*/
/*
class Adder{
    static int add(int a, int b) {return a + b;}
    static double add(int a, int b,double c) {return a + b + c;}

    public static void main(String[] args) {
        System.out.println(Adder.add(11,12));
        System.out.println(Adder.add(11,12, 13.3));
    }
}
*/
/*
class Vehicle{
    void run(){System.out.println("Vehicle is running");}
}
class Bike2 extends Vehicle{
    void run(){System.out.println("Bike is running");}

    public static void main(String args[]){
        Bike2 obj = new Bike2();
        obj.run();
    }
}
*/
class Animal{
    String color="white";
}
class Dog extends  Animal {
    String color = "black";

    void printColor() {
        System.out.println("Dog Class color: " + color);
        System.out.println("Animal class color: " + super.color);
    }
}
    class TestSuper{
        public static void main(String args[]){
            Dog d=new Dog();
            d.printColor();
        }}



