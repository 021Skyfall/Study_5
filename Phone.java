public class Phone {
    public String model;
    public String color;
    public String number;

    public Phone(String model, String color, String number) {
        this.model = model;
        this.color = color;
        this.number = number;
    }

    void any() {
        System.out.println("암거나");
    }
    void  thing() {
        System.out.println("동작해라");
    }
}
