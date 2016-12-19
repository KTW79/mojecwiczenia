/**
 * Created by Kasia on 18.12.2016.
 */
public class Room {
    public static void main(String[] args) {
   /*  Furniture furniture1 = new Furniture ();
      furniture1.name = "kanapa";
      furniture1.colour = "beżowa";
      furniture1.amount = 2;

      Furniture furniture2 = new Furniture();
      furniture2.name = "krzesła";
      furniture2.colour = "brązowe";
      furniture2.amount = 4;

        System.out.println("W pokoju stoi "+ furniture1.name + ", która jest "+ furniture1.colour
                           + " w ilości "+ furniture1.amount + ".");
        System.out.println("W pokoju stoją "+ furniture2.name + ", które są "+ furniture2.colour
                + " i jest ich "+ furniture2.amount + ".");*/

        Furniture furniture1 = new Furniture("kanapa","beżowa",2);
        Furniture furniture2 = new Furniture("krzesła","brązowe",4);

        System.out.println("Rodzaj mebla: "+ furniture1.name + ", kolor: " + furniture1.colour
                           + ", ilość mebli w pokoju: " + furniture1.amount+".");
        System.out.println("Rodzaj mebla: "+furniture2.name + ", kolor: " + furniture2.colour
                           + ", ilość w pokoju: " + furniture2.amount+".");

    }
    }

