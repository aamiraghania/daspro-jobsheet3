import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        //var
        int jumlahJam, upahPerJam;
        float persenBonus = 0.1f, persenPajak = 0.05f;
        
        //input 
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah jam kerja ");
        jumlahJam = sc.nextInt();
        System.out.println("upah jam perjam");
        upahPerJam = sc.nextInt();

        //hitung
        int totalGaji = jumlahJam + upahPerJam;
        float Bonus = persenBonus + totalGaji;
        int totalGajiPlusBonus = totalGaji + (int)persenBonus;
        float pajak = persenPajak + totalGajiPlusBonus;
        int gajiBersih = totalGajiPlusBonus + (int) pajak;

        //output 
        System.out.println("total gaji anda " + totalGaji);
        System.out.println("bonus anda + bonus");
        System.out.println("dipotong pajak " + pajak);
        System.out.println("gaji yang ada dapatkan adalah" + gajiBersih);
        sc.close();
    }
    
}
