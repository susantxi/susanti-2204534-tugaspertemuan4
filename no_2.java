package java_percabangan;

import java.util.Scanner;

public class no_2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Masukkan Nilai UTS : ");
        double uts = userInput.nextDouble();
        System.out.print("Masukkan Nilai UAS : ");
        double uas = userInput.nextDouble();
        System.out.print("Masukkan Nilai Tugas : ");
        double tugas = userInput.nextDouble();
        
        double nilai_uts = 0.35 * uts;
        double nilai_uas = 0.45 * uas;
        double nilai_tugas = 0.20 * tugas;
        
        double jumlah = nilai_uts + nilai_uas + nilai_tugas;
        
        System.out.printf("\nNilai Akhir = %.2f \n", jumlah);
        
        if(jumlah >=  80 && jumlah <= 100) {//80-100
            System.out.print("Indeks = A");
        }else if (jumlah >=  70 && jumlah < 80) {//70-79
            System.out.print("Indeks = B");
        }else if (jumlah >=  50 && jumlah < 70) {///50-69
            System.out.print("Indeks = C");
        }else if (jumlah >= 30 && jumlah < 50){//30-49
            System.out.print("Indeks = D");
        }else {
            System.out.print("Indeks = E");
        }
        
        System.out.print("\n\n");
                
        userInput.close();
    }
}
