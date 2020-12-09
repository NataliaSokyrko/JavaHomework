public class PreciousStone extends Stone {
 
   private String name;
   private double weight;
   private double price;
 
   public PreciousStone(String name, double weight, double price) {
      this.name = name;
      this.weight = weight;
      this.price = price;
   }
 
   public void setName(String name) {
      this.name = name;
   }
 
   public String getName() {
      return name;
   }
 
   public double getWeight() {
      return weight;
   }
 
   public void setWeight(double weight) {
      this.weight = weight;
   }
 
   public double getPrice() {
      return price;
   }
 
   public void setPrice(double price) {
      this.price = price;
   }
 
}