import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector=new Scanner(System.in);
        double altura, ladosTMA, ladosTme ,largoTMA, largoTme, ApotemaP;
        double PerimetroBMa, PerimetroBme, AreaBMA, AreaBme;
        double AreaL, AreaT, Volumen;
        //Espacio
        do{
        System.out.println("Ingrese altura: ");
        altura = lector.nextInt();
        }while(altura>0);
        do{
        System.out.println("Ingrese lados de la base mayor: ");
        ladosTMA = lector.nextInt();
        }while(ladosTMA>0);
        do{
        System.out.print("Ingrese lados de la base menor: ");
        ladosTme = lector.nextInt();
        }while(ladosTme>0);
        do{
        System.out.print("Ingrese el apotema de la piramide: ");
        ApotemaP = lector.nextInt();
        }while(ApotemaP>0);
        do{
        System.out.println("Ingrese el largo de la base mayor: ");
        largoTMA = lector.nextInt();
        }while(largoTMA>0);
        do{
        System.out.print("Ingrese el largo de la base menor: ");
        largoTme = lector.nextInt();
        }while(largoTme>0);
        //
        PerimetroBMa=(ladosTMA*largoTMA);
        PerimetroBme=(ladosTme*largoTme);
        AreaL=(((PerimetroBMa+PerimetroBme)/(2))*(ApotemaP));
        AreaBMA=((PerimetroBMa*ApotemaP)/(2));
        AreaBme=((PerimetroBme*ApotemaP)/(2));
        AreaT=(AreaL+AreaBMA+AreaBme);
        Volumen=(((1/3)*altura)*(AreaBMA+AreaBme+Math.sqrt(AreaBMA*AreaBme)));
        //
        System.out.println("Area lateral: " + AreaL + " unidades cuadradas.");
        System.out.println("Area total: " + AreaT + " unidades cuadradas.");
        System.out.println("Volumen: " + Volumen + " unidades cubicas.");
        //
        lector.close();
    }
}
