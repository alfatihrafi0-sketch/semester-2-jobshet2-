public class mataKuliahMain {
    public static void main(String[] args) {
        mataKuliah mk1 = new mataKuliah();
        mk1.nama = "Pemrograman Berorientasi Objek";
        mk1.kodeMk = "SIB123";
        mk1.sks = 3;
        mk1.jumlahJam = 48;

        mk1.tampilkanInformasi();
        mk1.ubahsks(4);
        mk1.tambahJam(16);
        mk1.kurangiJam(8);
        mk1.tampilkanInformasi();

    }
}
