import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * Created by Kasia on 18.12.2016.
 */
public class ShapeCalc1 {
    public static void main(String[] args) {
        System.out.println("Obliczanie pola kwadratu dla:");
        ShapeCalc calc=new ShapeCalc(); //tworzę obiekt ShapeCalc o nazwie calc i wywołuję odniesienie do istniejącej już klasy ShapeCalc, czyli piszę new ShapeCalc
        double multi_q_result=calc.multi_q(4);
        System.out.println("- boku 4cm, wynik: "+ multi_q_result +"cm2");
        multi_q_result=calc.multi_q(6);
        System.out.println("- boku 6cm, wynik: "+ multi_q_result +"cm2");
        multi_q_result=calc.multi_q(10);
        System.out.println("- boku 10cm, wynik: "+ multi_q_result +"cm2");

        System.out.println("\nObliczanie pola koła dla:");
        double multi_c_result=calc.multi_c(3.14, 4);
        System.out.println(" - promienia 4cm, wynik: "+ multi_c_result+"cm2");
        multi_c_result=calc.multi_c(3.14, 5);
        System.out.println(" - promienia 5cm, wynik: "+ multi_c_result+"cm2");
        multi_c_result=calc.multi_c(3.14, 12);
        System.out.println(" - promienia 12cm, wynik: "+ multi_c_result+"cm2");

        System.out.println("\nObliczanie obwodu trójkąta dla:");
        double add_t_result=calc.add_t(3,4,5);
        System.out.println(" - boków odpowiednio: 3cm, 4cm, 5cm, wynik: "+add_t_result+"cm");
        add_t_result=calc.add_t(2,3,5);
        System.out.println(" - boków odpowiednio: 2cm, 3cm, 5cm, wynik: "+add_t_result+"cm");
        add_t_result=calc.add_t(5,7,10);
        System.out.println(" - boków odpowiednio: 5cm, 7cm, 10cm, wynik: "+add_t_result+"cm");

      /*  System.out.println("\nObliczanie obwodu prostokąta dla:"); //tu zapis całości dla użytego typu double
        double multiandAdd=calc.multiandAdd(3,8);
        System.out.println(" - boków odpowiednio: 3cm, 8cm, wynik: "+multiandAdd+"cm");
        multiandAdd=calc.multiandAdd(4,8);
        System.out.println(" - boków odpowiednio: 4cm, 8cm, wynik: "+multiandAdd+"cm");
        multiandAdd=calc.multiandAdd(2,6);
        System.out.println(" - boków odpowiednio: 2cm, 6cm, wynik: "+multiandAdd+"cm");*/

        System.out.println("\nObliczanie obwodu prostokąta dla:"); //tu zapis tego samego, co powyżej dla użytego void
        System.out.print(" - boków odpowiednio: 3cm, 8cm, wynik: ");
        calc.multiandAdd(3,8);
        System.out.print(" - boków odpowiednio: 4cm, 9cm, wynik: ");
        calc.multiandAdd(4,9);
        System.out.print(" - boków odpowiednio: 2cm, 6cm, wynik: ");
        calc.multiandAdd(2,6);

    }

}
