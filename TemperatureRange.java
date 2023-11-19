// TemperatureRange Class
public class TemperatureRange {
  private int minTemp;
  private int maxTemp;

  // Constructor, getters, setters, and any other necessary methods

  // Example constructor
  public TemperatureRange(int minTemp, int maxTemp) {
    this.minTemp = minTemp;
    this.maxTemp = maxTemp;
  }

  public int getMax() {
    return this.maxTemp;
  }

  public int getMin() {
    return this.minTemp;
  }

  public void setMax(int x) {
    this.maxTemp = x;
  }

  public void setMin(int x) {
    this.minTemp = x;
  }

  public String toString() {
    return "Max Temp = " + maxTemp + ", Min Temp = " + minTemp;
  }
}
