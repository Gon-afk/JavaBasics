public class TestBuilderPattern {
    public static void main(String[] args) {
        Computer comp = new Computer.ComputerBuilder(
                "500 GB", "2 GB")
                .setGraphicsCardEnabled(true)
                .build();
    }
}
