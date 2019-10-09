import cars.Car;

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

  public double getAmount() {
    return _car.getAmount(_daysRented);
  }

  public double getFrequentRenterPoints() {
    return _car.getFrequentRenterPoints(_daysRented);
  }
}