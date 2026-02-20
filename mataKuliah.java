public class mataKuliah {
    String nama;
    String kodeMk;
    int sks;    
    int jumlahJam;
    
    void tampilkanInformasi() {
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("Kode Mata Kuliah: " + kodeMk);
        System.out.println("jumlahSKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }
    void ubahsks(int sksBaru) {
        sks = sksBaru;
        System.out.println("sks berhasil diubah menjadi: " + sks);
    }
    void tambahJam(int jumlahJamBaru) {
        jumlahJam += jumlahJamBaru;
        System.out.println("jumlah jam berhasil diubah menjadi: " + jumlahJam);
    }
    void kurangiJam (int jam) {
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
            System.out.println("jumlah jam dikurangi menjadi: " + jumlahJam);
        } else {
            System.out.println("jumlah jam tidak mencukupi untuk dikurangi");
        }
    }
}
       