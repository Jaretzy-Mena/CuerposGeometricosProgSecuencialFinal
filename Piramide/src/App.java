import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        double ApotemaBase, altura, ladosB, nLados;
        double ApotemaCara, PerimetroB, BaseA;
        double Volumen, AreaT, AreaL;
        //datos
        do{
        System.out.print("Ingrese la medida del apotema base: ");
        ApotemaBase = lector.nextInt();
        }while(ApotemaBase>0);
        do{
        System.out.print("Ingrese altura: ");
        altura = lector.nextInt();
        }while(altura>0);
        do{
        System.out.print("Ingrese los lados de la base: ");
        ladosB = lector.nextInt();
        }while(ladosB>0);
        do{
        System.out.print("Ingrese el número de lados: ");
        nLados = lector.nextInt();
        }while(nLados>0);
        //Procesar datos
        ApotemaCara=(Math.sqrt((altura*altura)+(ApotemaBase*ApotemaBase)));
        PerimetroB=(nLados*ladosB);
        AreaL=(PerimetroB*ApotemaCara)/(2);
        BaseA=(PerimetroB*ApotemaBase)/(2);
        AreaT=(AreaL+BaseA);
        Volumen=(BaseA*altura)/(3);
        //Mostrar los resultados
        System.out.println("Area lateral: " + AreaL + " unidades cuadradas.");
        System.out.println("Area total: " + AreaT + " unidades cuadradas.");
        System.out.println("Volumen: " + Volumen + " unidades cubicas.");
        
        lector.close();
    }
}
