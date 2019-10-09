
// Basic program that calculates a statement of a customer's charges at a car rental store.
// 
// A customer can have multiple "Rental"s and a "Rental" has one "Car"
// As an ASCII class diagram: 
//          Customer 1 ----> * Rental
//          Rental   * ----> 1 Car
// 
// The charges depend on how long the car is rented and the type of the car (economy, muscle or supercar)
// 
// The program also calculates frequent renter points.
// 
// 
// Refactor this class how you would see fit.
// 
// Please note, that while the code is in Java, you can write your answer in Javascript or pseudocode. 
// The actual code is not that important, as much as its structure. You can even use "magic" functions (e.g. foo.sort()) if you want


 public class Car {
  public static final int  MUSCLE = 2;
  public static final int  ECONOMY = 0;
  public static final int  SUPERCAR = 1;
  private String _title;
  private int _priceCode;
  public Car(String title, int priceCode) {
     _title = title;
     _priceCode = priceCode;
  }
  public int getPriceCode() {
     return _priceCode;
  }
  public void setPriceCode(int arg) {
     _priceCode = arg;
  }
  public String getTitle() {
     return _title;
  } 
}


 class Rental {
  private Car _car;
  private int _daysRented;
  public Rental(Car car, int daysRented) {
     _car = car;
     _daysRented = daysRented;
  }
  public int getDaysRented() {
     return _daysRented;
  }
  public Car getCar() {
     return _car;
  } 
}

class Customer {
  private String _name;
  private List<Rental> _rentals = new ArrayList<Rental>();
  public Customer(String name) {
     _name = name;
  }
  public void addRental(Rental arg) {
     _rentals.addElement(arg);
  }
  public String getName() {
     Return _name;
  }

  public String billingStatement() {
   double totalAmount = 0;
   int frequentRenterPoints = 0;
   Enumeration rentals = _rentals.elements();
   String result = "Rental Record for " + name() + "\n";
   while (rentals.hasMoreElements()) {
      double thisAmount = 0;
      Rental each = (Rental) rentals.nextElement();
      //determine amounts for each line
      switch (each.getCar().getPriceCode()) {
        case Car.ECONOMY:
           thisAmount += 80;
           if (each.getDaysRented() > 2)
              thisAmount += (each.getDaysRented() - 2) * 30;
           break;
        case Car.SUPERCAR:
           thisAmount += each.getDaysRented() * 200;
           break;
        case Car.MUSCLE:
           thisAmount += 200;
           if (each.getDaysRented() > 3)
              thisAmount += (each.getDaysRented() - 3) * 50;
        break;
  }
      // add frequent renter points
      frequentRenterPoints ++;
  // add bonus for a two day new release rental
  if ((each.getCar().getPriceCode() == Car.SUPERCAR) && each.getDaysRented() > 1) frequentRenterPoints ++;
  //show figures for this rental
  result += "\t" + each.getCar().getTitle()+ "\t" + String.valueOf(thisAmount) + "\n";
      totalAmount += thisAmount;
  }
  //add footer lines
  result += "Final rental payment owed " + String.valueOf(totalAmount) + "\n";
  result += "You received an additional " + String.valueOf(frequentRenterPoints) + " frequent customer points"; return result;
  }
}
