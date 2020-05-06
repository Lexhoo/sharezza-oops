public abstract class Vehicle {
   
   //Attributs
   private String brand;
   private int kilometers;
   
   //Constructeur
   public Vehicle(String brand) {
     this.brand = brand;
     this.kilometers = 0;
   }
    //Getters Setters
    public String getBrand() {  
        return this.brand;  
    }  
  
    public void setBrand(String brand) {  
        this.brand = brand;  
    }  
  
    public int getKilometers() {  
        return this.kilometers;  
    }  
  
    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    //Methode abstraite
    public abstract String doStuff();
}
