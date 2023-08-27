import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        double altura, radio;
        double volumen, area;
        do{
        System.out.print("Ingrese la altura entre las radios: ");
        altura = lector.nextInt();
        }while(altura>0);
        do{
        System.out.print("Ingrese radio: ");
        radio =lector.nextInt();
        }while(radio>0);
        //separador
        volumen=(((Math.PI*altura*altura)*((3*radio)-(altura)))/(3));
        area=(2*Math.PI*altura*radio);
        //ultimoSeparador
        System.out.println("El area es de: " + area);
        System.out.println("El volumen es de "+ volumen);
        lector.close();
    }
}