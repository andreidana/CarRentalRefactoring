package cars;

public class MuscleCar extends Car {
  public MuscleCar(String title) {
    super(title);
  }

  public double getAmount(int daysRented) {
    double thisAmount = 200;

    if (daysRented > 3)
      thisAmount += (daysRented - 3) * 50;

    return thisAmount;
  }

  public double getFrequentRenterPoints(int daysRented) {
    return 1;
  }
}