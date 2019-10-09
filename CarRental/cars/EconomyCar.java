package cars;

public class EconomyCar extends Car {
  public EconomyCar(String title) {
    super(title);
  }

  public double getAmount(int daysRented) {
    double thisAmount = 80;

    if (daysRented > 2)
      thisAmount += (daysRented - 2) * 30;

    return thisAmount;
  }

  public double getFrequentRenterPoints(int daysRented) {
    return 1;
  }
}