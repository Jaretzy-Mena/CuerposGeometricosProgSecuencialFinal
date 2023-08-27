import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        //variables
        double radio, altura;
        double BaseP, BaseA;
        double Volumen, AreaT, AreaL;
        //datos
        
        do{
        System.out.print("Ingrese radio: ");
        radio = lector.nextInt();
        }while(radio>0);
        
        do{
        System.out.print("Ingrese altura: ");
        altura = lector.nextInt();
        }while(altura>0);

        //Procesar datos
        BaseP=(2 * Math.PI * radio);
        BaseA=(Math.PI * radio * radio);
        AreaL=(BaseP * altura);
        AreaT=(AreaL)+(2*BaseA);
        Volumen=(BaseA*altura);
        //resultados
        System.out.println("Area lateral: " + AreaL + " unidades cuadradas");
        System.out.println("Area total: " + AreaT + " unidades cuadradas");
        System.out.println("Volumen: " + Volumen + " unidades cuadradas");
        //Cierre
        lector.close();
    }
}
