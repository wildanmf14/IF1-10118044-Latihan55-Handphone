public class Handphone {

    protected String manufacture;
    protected String operatingSystem;
    protected String model;
    protected int harga;

    public Handphone(String manufacture, String operatingSystem, String model, int harga) {
        this.manufacture = manufacture;
        this.operatingSystem = operatingSystem;
        this.model = model;
        this.harga = harga;
    }

    public void displayProduct() {
        System.out.printf("Manufaktur\t\t: %s%n", manufacture);
        System.out.printf("OS\t\t\t: %s%n", operatingSystem);
        System.out.printf("Model\t\t\t: %s%n", model);
        System.out.printf("Harga\t\t\t: %d%n", harga);
    }

}
