
package projectgaji;
import projectgaji.gaji;


public class ProjectGaji {

    public static void main(String[] args) {
        
        gaji gp1 = new gaji();
        
        gp1.kodeKaryawan = "K0001";
        gp1.namaKaryawan = "INDRA PRAMANA";
        gp1.statusMenikah = 'Y';
        gp1.jmlAnak = 6;
        gp1.gajipokok = 5000000;
        
        // setting golongan karyawan
        gp1.gol = "IIIa";
        // setting total pinjaman
        gp1.totPinjaman = 3000000;
        
        System.out.println("=================================================");
        System.out.println("KODE KARYAWAN : " +gp1.kodeKaryawan);
        System.out.println("NAMA KARYAWAN : " +gp1.namaKaryawan);
        System.out.println("STATUS MENIKAH : " + gp1.statusMenikah);
        System.out.println("JUMLAH ANAK : " + gp1.jmlAnak);
        System.out.format("GAJI POKOK : Rp %10.1f \n",gp1.gajipokok);
        System.out.println("=================================================");
        System.out.format("TUNJANGAN ANAK : Rp. %10.1f \n",gp1.hitungTunjAnak(gp1.jmlAnak));
        System.out.format("TUNJANGAN ISTRI : Rp. %10.1f \n",gp1.hitungTunjIstri(gp1.statusMenikah));
        System.out.format("POTONGAN : Rp. %10.1f \n",gp1.hitungPotongan());
        System.out.format("GAJI BERSIH : Rp %10.1f \n",gp1.hitungGajiBersih());
        System.out.println("=================================================");
        gp1.simulasiAngsuranPinjaman();
        
    }
}
