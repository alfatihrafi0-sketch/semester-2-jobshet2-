public class rafiMain18 {
    public static void main(String[] args) {
      
        rafi18 mhs1 = new rafi18();
      mhs1.nama = "Rafi";
      mhs1.nim = "254107060134";
      mhs1.kelas = "SIB 1D";
      mhs1.ipk = 3.75;

      mhs1.tampilkanInformasi();
      mhs1.ubahKelas("SIB 1E");
      mhs1.updateIpk(3.85);
        mhs1.tampilkanInformasi();

    rafi18 mhs2 = new rafi18("Annisa Nabila", "2141720160", "TI 2L", 3.25);
     mhs2.updateIpk(3.30);
     mhs2.tampilkanInformasi();

     rafi18 mhs3 = new rafi18("Muhammad Rafialfatih", "254107060134", "SI 1D", 3.75);
     mhs3.updateIpk(3.90);                                                                                  
        mhs3.tampilkanInformasi();
    }
}
