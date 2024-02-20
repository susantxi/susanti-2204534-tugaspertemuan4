package java_percabangan;

import java.util.Scanner;

public class no_3 {
    public static void main(String[] Args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Penumpang : ");
        int jumlahPenumpang = userInput.nextInt();

        int jumlahMobil = jumlahPenumpang / 7;//7 : jumlah maksimal penumpang tiap mobil
        
        if (jumlahPenumpang % 7 != 0) {//menghasilkan sisa
            jumlahMobil++;
        }

        System.out.println("Mobil yang diperlukan: " + jumlahMobil);
        
        userInput.close();
    }
}
