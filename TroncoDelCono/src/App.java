import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector=new Scanner(System.in);
        double altura, radiome, radioMa;
        double generatriz, AreaBMa, Areabme;
        double AreaL, AreaT, Volumen;
        //Espacio
        do{
        System.out.print("Ingrese altura: ");
        altura=lector.nextInt();
        }while(altura>0);
        do{
        System.out.print("Ingrese radio menor ");
        radiome=lector.nextInt();
        }while(radiome>0);
        do{
        System.out.print("Ingrese radio mayor ");
        radioMa=lector.nextInt();
        }while(radioMa>0);
        //Espacio
        generatriz=(Math.sqrt((altura*altura)+((radioMa-radiome)*(radioMa-radiome))));
        AreaL=((Math.PI*generatriz)*(radioMa+radiome));
        AreaBMa=(Math.PI*radioMa*radioMa);
        Areabme=(Math.PI*radiome*radiome);
        AreaT=(AreaL+AreaBMa+Areabme);
        Volumen=(((1/3)*(Math.PI*altura))*((radioMa*radioMa)+(radiome*radiome)+(radioMa*radiome)));
        ///Espacio
        System.out.println("Area lateral: " + AreaL + " unidades cuadradas.");
        System.out.println("Area total: " + AreaT + " unidades cuadradas.");
        System.out.println("Volumen: " + Volumen + " unidades cubicas.");
        //Espacio
        lector.close();        
    }
}