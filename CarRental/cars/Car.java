package cars;

public abstract class Car {
   private String _title;

   public Car(String title) {
     _title = title;
   }

   public String getTitle() {
     return _title;
   }

   public abstract double getAmount(int daysRented); 
   public abstract double getFrequentRenterPoints(int daysRented);

}