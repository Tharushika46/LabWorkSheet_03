package Q_04;

public class Main {
    public static void main(String[] args) {
        //1st method
        Owner owner1 = new Owner("Samantha","0777777777");
        //2nd method
        Owner owner2 = new Owner();
        owner2.setOwnerName("Tharidu");
        owner2.setPhoneNo("0788888888");

        Bicycle bicycle1 = new Bicycle(owner1,"Tomohok","2019");
        Bicycle bicycle2 = new Bicycle();
        bicycle2.setOwner(owner2);
        bicycle2.setModelName("DSI");
        bicycle2.setManufactureYear("2020");

        System.out.println("Name : " + owner1.getOwnerName());
        System.out.println("Brand Name and Year: " + bicycle1.getModelName()+ " Manufactured in " + bicycle1.getManufactureYear());

        System.out.println("Name : " + owner2.getOwnerName());
        System.out.println("Brand Name and Year: " + bicycle2.getModelName()+ " Manufactured in " + bicycle2.getManufactureYear());


    }
}
