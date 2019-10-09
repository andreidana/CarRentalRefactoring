import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

class Customer {
   private String _name;
   private int _totalAmount;
   private int _frequentRenterPoints;
   private List<Rental> _rentals = new ArrayList<Rental>();

   public Customer(String name) {
      _name = name;
   }

   public void addRental(Rental arg) {
      _rentals.add(arg);
   }

   public String getName() {
      return _name;
   }

   public String billingStatement() {
      resetAmounts();
      return titleString() + rentalLines() + totalAmountString() + frequentRenterPointsString()
   }

   private void resetAmounts() {
      _totalAmount = 0;
      _frequentRenterPoints = 0;
   }

   private String titleString() {
     return "Rental Record for " + getName() + "\n";
   }

   private String rentalLines() {
      Enumeration rentals = _rentals.elements();
      String rentalLines = " ";

      while (rentals.hasMoreElements()) {
         Rental rental = (Rental) rentals.nextElement();
         rentalLines += "\t" + rental.getCar().getTitle()+ "\t" + String.valueOf(rental.getAmount()) + "\n";
         _totalAmount += rental.getAmount();
         _frequentRenterPoints += rental.getFrequentRenterPoints();
      }

      return rentalLines;
   }

   private String totalAmountString() {
      return "Final rental payment owed " + String.valueOf(_totalAmount) + "\n";
   }

   private String frequentRenterPointsString() {
      return "You received an additional " + String.valueOf(_frequentRenterPoints) + " frequent customer points";
   }
}
