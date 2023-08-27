import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        double radio, altura;
        double generatriz, generatrizG;
        double Volumen, AreaT, AreaL;
        //datos
        do{
        System.out.print("Ingrese altura: ");
        altura = lector.nextInt();
        }while(altura>0);
        do{
        System.out.print("Ingrese radio: ");
        radio = lector.nextInt();
        }while(radio>0);
        //procedimiento
        generatriz=(Math.sqrt((radio*radio)+(altura*altura)));
        generatrizG=generatriz;
        AreaL=(Math.PI*radio*generatrizG);
        AreaT=(Math.PI*radio)*(generatrizG*radio);
        Volumen=(Math.PI*radio*radio*altura)/(3);
        //procedimiento        
        System.out.println("Area lateral: " + AreaL + " unidades cuadradas.");
        System.out.println("Area total: " + AreaT + " unidades cuadradas.");
        System.out.println("Volumen: " + Volumen + " unidades cubicas.");
        //final
        lector.close();
    }
}