package giris;
import java.util.Scanner;
public class ödev {
    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
        double a,b,c,alan;

        System.out.print("birinci dik kenarı giriniz: ");
        a = input.nextDouble();

        System.out.print("ikinci dik kenarı giriniz");
        b = input.nextDouble();

        c = Math.sqrt((a * a) + (b * b));
        System.out.println("hipotenüs uzunluğu: "+c);


        alan = (a * b) / 2;
        System.out.print("üçgenin alanı: "+alan);









    }
}
