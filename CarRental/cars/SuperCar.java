package cars;

public class SuperCar extends Car {
  public SuperCar(String title) {
    super(title);
  }

  public double getAmount(int daysRented) {
    return daysRented * 200;
  }

  public double getFrequentRenterPoints(int daysRented) {
    return (daysRented > 1) ? 2 : 1;
  }
}