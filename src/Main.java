public class Main {
    static strictfp void sum(float a, float b) {
        //Gives the same result in diferent platforms
        System.out.println("Sum: "+ (a+b) );
    }
    public static void main(String[] args) {
        Vehicle mercedes = new Car();
        mercedes.start();

        StudentEncapsulation s = new StudentEncapsulation();

        s.setName("Paulo");
        System.out.println(s.getName());
        sum(5.7F,10.3F);
        System.out.println("Hello world!");
    }
}