public class Car {
    
    String brand;
    int speed;

    
    void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }

    public static void main(String[] args) {
        
        Car c1 = new Car(); 
        c1.brand = "Toyota";
        c1.speed = 120;

        
        Car c2 = new Car(); 
        c2.brand = "BMW";
        c2.speed = 180;

        
        c1.showDetails();
        c2.showDetails();
    }
}
