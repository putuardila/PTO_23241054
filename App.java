// Kalkulator dengan konstruktor
class Kalkulator{
    // Atribut kalkulator
    double angka1;
    double angka2;
    double penjumlahan;
    double pengurangan;
    double perkalian;
    double pembagian;

    // Konstruktor untuk menginisialisasi angka-angka
    Kalkulator(double inputAngka1, double inputAngka2) {
       angka1 = inputAngka1;
       angka2 = inputAngka2;
       penjumlahan = angka1 + angka2;
       pengurangan = angka1 - angka2;
       perkalian   = angka1 * angka2;
       pembagian   = angka1 / angka2;

    // Menampilkan hasil dari berbagai operasi
    System.out.println("    KALKULATOR    ");
    System.out.println("------------------");
    System.out.println(" Penjumlahan: " + penjumlahan);
    System.out.println(" Pengurangan: " + pengurangan);
    System.out.println(" Perkalian  : " + perkalian);

    // NOTE jika bilangan ke dua nilainya 0, maka nilai pertama tidak bisa di bagi dengan bilangan ke dua
    if (angka2 != 0) {
    pembagian   = angka1 / angka2;
    System.out.println(" Pembagian  : " + pembagian);
       } else {
           System.out.println("Nilai pertama tidak bisa di bagi dengan Nol");
       }
 }          
}
public class  App{
   public static void main(String[] args) {
       // Membuat objek kalkulator dengan nilai pertama dan nilai kedua
       Kalkulator Kalkulator1 = new Kalkulator(20, 4);
   }
}