import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector=new Scanner(System.in);
        double radio, grados;
        double area, volumen;
        //Espacio
        do{
        System.out.print("Ingrese radio: ");
        radio =lector.nextInt();
        }while(radio>0);
        do{
        System.out.print("Ingrese grados: ");
        grados =lector.nextInt();
        }while(grados>0);
        //Espacio
        area=((4*Math.PI*radio*radio*grados)/(360));
        volumen=((4/3)*((Math.PI*radio*radio*radio*grados)/(360)));
        //ESpacio
        System.out.println("El area es de: "+ area);
        System.out.println("El volumen es de: "+volumen);
        //Espacio
        lector.close();
    }
}