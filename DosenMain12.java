import java.util.Scanner;
public class DosenMain12 {
    public static void main(String[] args) {
        Dosen12 dosen1 = new Dosen12("D001", "Dr. Alfarizi", true, 2010, "Machine Learning");
        dosen1.tampilInformasi();

        dosen1.setStatusAktif(false);
        dosen1.ubahKeahlian("Basis Data");

        dosen1.tampilInformasi();
        System.out.println("Masa kerja: " + dosen1.hitungMasaKerja(2025) + " tahun");

        Dosen12 dosen2 = new Dosen12();
        dosen2.tampilInformasi();

        dosen2.idDosen = "D002";
        dosen2.nama = "Dr. Siti Nurmaini";
        dosen2.statusAktif = true;
        dosen2.tahunBergabung = 2019;
        dosen2.bidangKeahlian = "Algoritma dan Pemograman";

        dosen2.tampilInformasi();
        System.out.println("Masa kerja: " + dosen2.hitungMasaKerja(2025) + " tahun");
    }
}