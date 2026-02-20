public class dosenMain {
    public static void main(String[] args) {
        dosen dosen1 = new dosen();
        dosen1.idDosen = "D001";
        dosen1.nama = "Dr. Budi Santoso";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2010;
        dosen1.bidangKeahlian = "Pemrograman";

        dosen1.tampilkanInformasi();
        dosen1.ubahBidangKeahlian("Sistem Informasi");
        dosen1.ubahStatusAktif(false);  
        dosen1.hitungMasaKerja(2024);
        dosen1.tampilkanInformasi();
    System.out.println("Masa kerja dosen: " + (2024 - dosen1.tahunBergabung) + " tahun");


        dosen dosen2 = new dosen("D002", "Dr. Siti Aminah", true, 2015, "Basis Data");
        dosen2.tampilkanInformasi();
        dosen2.ubahStatusAktif(false);
        dosen2.hitungMasaKerja(2024);
        dosen2.tampilkanInformasi();
    System.out.println("Masa kerja dosen: " + (2024 - dosen2.tahunBergabung) + " tahun");
    }
}
