public class Modifikasi2 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }
    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru) {
        ipk = ipkBaru;
    }
    public static void main(String[] args) {
        MahasiswaMain12 mhs1 = new MahasiswaMain12(); 

        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "S1 2J"; 
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa mhs2 = new Mahasiswa("Annisa Nabila", "24141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();
    }
}
class Mahasiswa {
    String nama;
    String nim;
    String kelas;
    double ipk;

    Mahasiswa(String nama, String nim, double ipk, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
        this.kelas = kelas;
    }
    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }
    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru) {
        ipk = ipkBaru;
    }
}