import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("What is your package's weight?");
    Integer userWeight = Integer.parseInt(myConsole.readLine());
    System.out.println("What is your package's height?");
    Integer userHeight = Integer.parseInt(myConsole.readLine());
    System.out.println("What is your package's width?");
    Integer userWidth = Integer.parseInt(myConsole.readLine());
    System.out.println("What is your package's length?");
    Integer userLength = Integer.parseInt(myConsole.readLine());
    System.out.println("How far is your package traveling?");
    Integer userDistance = Integer.parseInt(myConsole.readLine());
    Parcels userParcel = new Parcels(userHeight, userWidth, userLength, userWeight, userDistance);
    Integer userVolume = userParcel.volume();
    Integer distanceCost = userParcel.costToShip();
    Integer finalParcelCost = userVolume + distanceCost;
    System.out.println("Your package's cost to ship is: $" + finalParcelCost);

  }
}
