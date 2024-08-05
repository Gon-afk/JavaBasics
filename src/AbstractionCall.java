public class AbstractionCall extends Abstraction {
    private int id;

    public AbstractionCall(String name, String gender, int id) {
        super(name, gender);
        this.id = id;
    }


    @Override
    public void work() {
        if (id == 0) {
            System.out.println("ERROR");
        }
        else{
            System.out.println("WORKED");
        }
    }

    public static void main(String[] args) {
        Abstraction example = new AbstractionCall("Alfredo", "Male", 0);
        Abstraction example1 = new AbstractionCall("Alvaro", "Male", 1);

        example.work();
        example1.work();

        example.changeValue("Rui");
        System.out.println("Name: "+ example.get_name());
    }
}
