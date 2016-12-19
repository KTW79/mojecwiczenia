/**
 * Created by Kasia on 17.12.2016.
 */
import java.util.Random;
public class MojeCwiczenia {
    public static void main(String[] args) {
        System.out.print("Cześć Jan, słyszałem,że masz ");
        System.out.print(25);
        System.out.print(" lat");
        System.out.print(" i uczysz się programowania. Czy to prawda?\n ");
        System.out.println(true);

        System.out.print("Czy twoje inicjały to ");
        System.out.println('J'+" "+'K'+" "+ '?');
        System.out.print("Tak,");
        System.out.println(true);

        //marka model rocznik cena
        String marka = "Fiat";
        String model = "126p";
        int rocznik = 1978;
        double cena = 2010.50;

        System.out.print("Marka: ");
        System.out.println(marka);
        System.out.print("Model: ");
        System.out.println(model);
        System.out.print("Rocznik: ");
        System.out.println(rocznik);
        System.out.print("Cena: ");
        System.out.println(cena);
        System.out.println("Marka: ");
        System.out.print(marka);
        System.out.print(" ");
        System.out.print(model);
        System.out.print(" ");
        System.out.print(rocznik);
        System.out.print(" ");
        System.out.println(cena);

        Random rand = new Random();
        int x = rand.nextInt(100); // losowa liczba z przedziału [0, 9], 10 się nie wlicza
        int y = rand.nextInt(100); // krótsza wersja
        System.out.println(x);
        System.out.println(y);
        System.out.println("x= " + x  +", y= "+ y);

        boolean result = x > y;
        System.out.println("x > y= "+result);

        result = x * 2 > y;
        System.out.println("x * 2 > y= "+result);

        result=y<x+3 && y > x-2;
        System.out.println("y<x+3 && y > x-2= " +result);

        result=(x*y)%2==0;
        System.out.println("(x*y)%2==0 "+ result);



    }
}
