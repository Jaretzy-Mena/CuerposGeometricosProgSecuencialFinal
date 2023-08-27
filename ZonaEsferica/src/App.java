import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        double radioCH, radioGR, altura, radio;
        double volumen, area;
        do{
        System.out.print("Ingrese la altura entre las radios: ");
        altura = lector.nextInt();
        
        do{
        System.out.print("Ingrese radio chiquita: ");
        radioCH =lector.nextInt();
        }while(radioCH>0);
        
        do{
        System.out.print("Ingrese radio grande ");
        radioGR=lector.nextInt();
        }while(radioGR>0);
        do{
        System.out.print("Ingrese radio: ");
        radio =lector.nextInt();
        }while(radio>0);
        //separador
        volumen=(((Math.PI*altura)*((altura*altura)+(3*radioCH*radioCH)+(3*radioGR*radioGR)))/(6));
        area=(2*Math.PI*altura*radio);
        //ultimoSeparador
        System.out.println("El area es de: " + area);
        System.out.println("El volumen es de "+ volumen);
        lector.close();
    }
}