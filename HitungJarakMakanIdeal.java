import java.util.Scanner;

public class HitungJarakMakanIdeal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan tinggi badan (cm): ");
        double tinggiBadan = input.nextDouble();
        
        System.out.print("Masukkan jenis kelamin (P/W): ");
        String jenisKelamin = input.next();
        
        double jarakMakanIdeal = hitungJarakMakanIdeal(tinggiBadan, jenisKelamin);
        
        System.out.println("Jarak makan ideal adalah: " + jarakMakanIdeal + " cm");
    }
    
    public static double hitungJarakMakanIdeal(double tinggiBadan, String jenisKelamin) {
        double jarakMakanIdeal;
        
        if (jenisKelamin.equalsIgnoreCase("P")) {
            jarakMakanIdeal = tinggiBadan - 110;
        } else if (jenisKelamin.equalsIgnoreCase("W")) {
            jarakMakanIdeal = tinggiBadan - 100;
        } else {
            throw new IllegalArgumentException("Jenis kelamin tidak valid. Masukkan P untuk perempuan atau W untuk laki-laki.");
        }
        
        return jarakMakanIdeal;
    }
}
