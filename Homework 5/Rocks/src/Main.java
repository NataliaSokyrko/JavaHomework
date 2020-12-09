import java.util.ArrayList;
import java.util.List;
 
public class Main {
 
   public static void main(String[] args) {
      List<Stone> stoneList = new ArrayList<Stone>();
      double i;
      double totalPreciousWeight = 0, totalPreciousPrice = 0;
      double totalSemiPreciousWeight = 0, totalSemiPreciousPrice = 0;
      for (i = 0; i < 20; i += 2)
         stoneList.add(new PreciousStone("preciousStone" + i, i / 10 + i / 100, i * 1000));
      for (i = 1; i < 20; i += 2)
         stoneList.add(new SemiPreciousStone("semiPreciousStone" + i, i / 5 + i / 150, i * 120 + i
               / 7));
 
      for (Stone stone : stoneList)
         if (stone instanceof PreciousStone) {
            totalPreciousWeight += stone.getWeight();
            totalPreciousPrice += stone.getPrice();
         } else if (stone instanceof SemiPreciousStone) {
            totalSemiPreciousWeight += stone.getWeight();
            totalSemiPreciousPrice += stone.getPrice();
         }
      System.out.println("Precious necklace:\nTotal weight: " + totalPreciousWeight
            + ";\nTotal price: " + totalPreciousPrice + "\n");
 
      System.out.println("Semiprecious necklace:\nTotal weight: " + totalSemiPreciousWeight
            + ";\nTotal price: " + totalSemiPreciousPrice);
   }
 
}