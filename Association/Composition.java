package Association;

/*
 * House contains Kicken so kicken can not make sense
 * it;s self so it is whole-part realtion
 * where hosue is whole and part is kicken
 * and part is can not exists
 * contained(house) breaks then part will break as 
 * well.
 */
class House {
  private String name;
  private String location;
  private Kicken kicken;

  House(String name, String location, Kicken kicken) {
    this.kicken = kicken;
    this.location = location;
    this.name = name;
  }

  @Override
  public String toString() {
    return "House [name=" + name + ", location=" + location + ", kicken=" + kicken + "]";
  }

}

class Kicken {
  private String color;
  private int high;
  private int width;

  Kicken(String color, int high, int width) {
    this.color = color;
    this.high = high;
    this.width = width;
  }

  @Override
  public String toString() {
    return "Kicken [color=" + color + ", high=" + high + ", width=" + width + "]";
  }

}

public class Composition {

  public static void main(String[] args) {
    Kicken kicken = new Kicken("blue", 50, 200);
    House house = new House("Yellow builidng", "Near VVP Colledge", kicken);

    System.out.println(house);

  }

}
