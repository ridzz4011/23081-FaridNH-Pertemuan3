package pertemuan3.code7;
import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean program = true;
            
            while (program) {
                // Menu
                System.out.println("\n==========| Kalkulator |==========");
                System.out.println("1. Pertambahan");
                System.out.println("2. Pengurangan");
                System.out.println("3. Perkalian");
                System.out.println("4. Pembagian");
                System.out.println("5. Modulo");
                System.out.println("6. Contoh buat inheritance");
                System.out.println("7. Exit");

                System.out.print("\nMasukan Pilihan: ");
                
                int pilihan = scanner.nextInt();
                
                if (pilihan == 7) {
                    program = false;
                    System.out.println("\nKeluar dari program...");
                } else {
                    System.out.print("\nMasukan angka pertama = ");
                    double angka1 = scanner.nextDouble();
                    
                    System.out.print("\nMasukan angka kedua = ");
                    double angka2 = scanner.nextDouble();
                    
                    Matematika hitung = new Matematika(angka1, angka2);
                    Matematika2 hitung2 = new Matematika2(angka1, angka2);

                    switch (pilihan) {
                        case 1 -> {
                            System.out.print("\n\nHasil pertambahan = " + hitung.pertambahan());
                        }
                        
                        case 2 -> {
                            System.out.print("\n\nHasil pengurangan = " + hitung.pengurangan());
                        }
                        
                        case 3 -> {
                            System.out.print("\n\nHasil perkalian = " + hitung.perkalian());
                        }
                        
                        case 4 -> {
                            System.out.print("\n\nHasil pembagian = " + hitung.pembagian());
                        }

                        case 5 -> {
                            System.out.print("\n\nHasil modulo = " + hitung.modulus());
                        }

                        case 6 -> {
                            System.out.print("\n\nHasil pengurangan dibagi pertambahan = " + hitung2.matematikaKompleksCeritanya());
                        }
                        
                        default -> {
                            System.out.print("\n\nMasukkan pilihan yang benar!");
                        }
                    }
                }
            }
        }
    }
}
