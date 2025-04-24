// Nama : Muhammad Razqa Izzazi
// Kelas: 1IA20
// NPM  : 51424440




public class Tugas3 {  
        public static void main(String[] args) {  
            // 1. Variabel tipe string berisi kalimat yang mengandung kata 'gunadarma'.  
            String kalimat = "Saya belajar di Universitas Gunadarma dan sangat senang.";  
            
            // 2. Print string dan panjang string.  
            System.out.println("String: " + kalimat);  
            System.out.println("Panjang String: " + kalimat.length());  
            
            // 3. Loop sebanyak 5 kali.  
            for (int i = 0; i < 5; i++) {  
                // a. Print iterasi ke berapa.  
                System.out.println("Iterasi ke: " + (i + 1));  
                
                // b. Jika iterasi < 2, print uppercase string.  
                if (i < 2) {  
                    System.out.println(kalimat.toUpperCase());  
                }  
                // c. Jika iterasi >= 2 dan < 4, print lowercase string.  
                else if (i >= 2 && i < 4) {  
                    System.out.println(kalimat.toLowerCase());  
                }  
                // d. Last iterasi: print posisi kata 'gunadarma' pada string.  
                if (i == 4) {  
                    int posisi = kalimat.toLowerCase().indexOf("gunadarma");  
                    System.out.println("Posisi kata 'gunadarma' pada string: " + posisi);  
                }  
            }  
        }  
    }  