public abstract class Abstraction {
    private String name;
    private String gender;

    public Abstraction(String name, String gender)
    {
        this.name = name;
        this.gender = gender;

    }
    public abstract void work();
    public void changeValue(String value)
    {
        this.name = value;
    }
    public String get_name()
    {
        return this.name;
    }
}
