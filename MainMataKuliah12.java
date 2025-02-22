public class MainMataKuliah12 {
    public static void main(String[] args) {
        
        MataKuliah12 mk1 = new MataKuliah12();
        mk1.kodeMK = "IF123";
        mk1.nama = "Algoritma dan Pemrograman";
        mk1.sks = 3;
        mk1.jumlahJam = 4;

        MataKuliah12 mk2 = new MataKuliah12("CS456", "Struktur Data", 4, 6);

        System.out.println("Informasi Mata Kuliah 1:");
        mk1.tampilInformasi();

        System.out.println("\nInformasi Mata Kuliah 2:");
        mk2.tampilInformasi();
    }
}