class GoKart {
  public static final int MAX_BARS = 8;
  private int barCount;
  private String color;
  private int lapsDriven;

  public GoKart(String color) {
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public void charge() {
    barCount = MAX_BARS;
  }

  public boolean isBatteryEmpty() {
    return barCount == 0;
  }

  public boolean isFullyCharged() {
    return MAX_BARS == barCount;
  }

  public void drive() {
    drive(1);
  }

  public void drive(int laps) {
    if (laps > barCount) {
      throw new IllegalArgumentException("Not enough battery remains");
    }
    lapsDriven += laps;
    barCount -= laps;
  }

}
