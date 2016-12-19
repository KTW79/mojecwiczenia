/**
 * Created by Kasia on 18.12.2016.
 */
public class ShapeCalc {
    double multi_q(double a){//metoda na pole kwadratu; ustalam typ zwracany double, metodę mutli_q (multi, bo mnożenie a q to info dla mnie, że dotyczy kwadratu i w nawiasach zmienne
        double result = a*a; // tu ustalam typ double, bo wynik bedzie liczą double i definiuję co ma się kryć pod result-czyli określam działanie, jakie ma dać mi wynik
        return result; //tu piszę, że ma mi zwrócić wynik, a nie gdzieś go obliczać w pamięci i tam trzymać.
    }
    double multi_c(double pi, double r){//metoda na pole koła
        double result = pi*r*r;
        return result;
    }
    double add_t(double a, double b, double c){//metoda na obwód trójkąta
        double result=a+b+c;
        return result;
    }
  /*  double multiandAdd(double a, double b){//metoda na obwód prostokąta
        double result=(2*a)+(2*b);
        return result;*/
  void multiandAdd(double a, double b){
      double result=(2*a)+(2*b);
      System.out.println(result);
    }

}




 //   public static void main(String[] args) {//pola kwadratu o pola koła o obwodu trójkąta o obwodu prostokąta
//       //pole trójkąta
//        System.out.println("Oblicz pole trójkąta:");
//        int a = 3;
//        int b = 4;
//        int c = 5;
//
//        System.out.println("wybrane boki trójkąta a = "+ a + ",b = "+ b + ",c = " + c);
//        double result = 0.5*(a*b);
//        System.out.println("Pole trójkąta wynosi "+ result);
//        System.out.println(" ");
//
//        //obwód trójkąta
//        System.out.println("Oblicz obwód trójkąta:");
//        result = a+b+c;
//       System.out.println("Obwód trójkąta wynosi: "+result);
//
//
//        //pole koła
//        System.out.println("Oblicz pole koła:");
//
//        int r = 4;
//
//        System.out.println("wybrany promień koła r = "+ r);
//        result = 3.14*r;
//        System.out.println("Pole koła wynosi "+ result);
//        System.out.println(" ");
//
//        //obwód prostokąta
//        System.out.println("Oblicz obwód prostokąta");
//        result = (2*a)+(2*b);
//        System.out.println("Obwód prostokąta wynosi: "+ result);
//
//            }
//        }
