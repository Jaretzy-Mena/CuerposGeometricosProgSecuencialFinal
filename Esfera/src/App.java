import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector =new Scanner(System.in);
        double radio;
        double Area, Volumen;
        //datos
        do{
        System.out.print("ingrese radio: ");
        radio=lector.nextInt();
        }while(radio>0);
        //procedimiento
        Area =(4*Math.PI)*(radio*radio);
        Volumen =((4/3)*(Math.PI*radio*radio*radio));
        //procediminento
        System.out.println("El area es de: " + Area);
        System.out.println("El volumen es de: "+Volumen);        
        //final
        lector.close();
    }
}