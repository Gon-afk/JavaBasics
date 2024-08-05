public interface Vehicle {
    public String licensePlate ="";
    public float maxVel = 0;

    public void start();
    public void stop();
    default void blowHorn(){
        System.out.println("HORN!");
    }
}
