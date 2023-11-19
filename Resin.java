
// Resin Class (Subclass of Materials)
class Resin extends Materials {
  private double volume;

  // Example constructor
  public Resin(String brand, String material, double cost, String type, double volume,
      Settings optimalSettings) {
    super(brand, material, cost, type, optimalSettings);
    this.setVolume(volume);
  }

  /**
   * @return the volume
   */
  public double getVolume() {
    return volume;
  }

  /**
   * @param volume the volume to set
   */
  public void setVolume(double volume) {
    this.volume = volume;
  }
}
