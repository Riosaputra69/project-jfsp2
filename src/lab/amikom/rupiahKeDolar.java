package lab.amikom;
import java.util.Scanner;

public class rupiahKeDolar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner masukkan = new Scanner(System.in);
        float rupiah, dolar;
        System.out.print("Masukkan Rupiah = ");
        rupiah = masukkan.nextFloat();
        dolar = (float) (rupiah*0.00014);
        
        System.out.println();
        System.out.println("Hasil Kurs tercepat = ");
        System.out.println("Dolar = " + dolar);
        System.out.println("Rupiah= " + rupiah);
       
	}

}
