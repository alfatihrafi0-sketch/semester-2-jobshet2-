public class dosen {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public dosen() {
    }

    public dosen(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }
    void tampilkanInformasi() {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Status Aktif: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }
    void ubahStatusAktif(boolean statusBaru) {
        statusAktif = statusBaru;
        System.out.println("Status aktif berhasil diubah menjadi: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
    }
    void ubahBidangKeahlian(String bidangBaru) {
        bidangKeahlian = bidangBaru;
        System.out.println("Bidang keahlian berhasil diubah menjadi: " + bidangKeahlian);
    }
    void hitungMasaKerja(int tahunSekarang) {
        int masaKerja = tahunSekarang - tahunBergabung;
        System.out.println("Masa kerja dosen: " + masaKerja + " tahun");
    }
}
