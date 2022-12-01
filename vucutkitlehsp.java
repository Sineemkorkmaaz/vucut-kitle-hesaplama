import java.util.Scanner;

public class vucutkitlehsp {
    public static void main(String[] args) {
        //Değerler
        double kg, m , sonuc;
    
         // kullanıcıdan veri alımı
         Scanner girdi = new Scanner(System.in);
         System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz:");
         m = girdi.nextDouble();

         System.out.print("Lütfen kilonuzu giriniz :");
         kg = girdi.nextDouble();


         sonuc = (kg/(m*m)) ;
         System.out.println("Vücut kitle indeksiniz :" +sonuc);

    }
}
