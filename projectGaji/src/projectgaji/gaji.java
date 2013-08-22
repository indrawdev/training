
package projectgaji;

public class gaji {
    
    public String kodeKaryawan;
    public String namaKaryawan;
    public float gajipokok;
    public char statusMenikah;
    public int jmlAnak;
    
    // tambahkan attribute/variable untuk pinjaman
    public float totPinjaman; // total pinjaman
    public String gol; // golongan karyawan
    
    public float hitungTunjIstri(char s) {
        float tunjIstri = 0;
        if (s == 'Y') {
            tunjIstri = (float) (0.1 * this.gajipokok);
        }
        return tunjIstri;
    }
    
    public float hitungPotongan() {
        float jmlPotongan;
        jmlPotongan = (float) (0.05 * (this.gajipokok + this.hitungTunjAnak
                (this.jmlAnak) + this.hitungTunjIstri(this.statusMenikah)));
        return jmlPotongan;
        
    }
    
    public float hitungTunjAnak(int n) {
        float tnjAnak;
        tnjAnak = (float) (n * 0.05 * this.gajipokok);
        return tnjAnak;
    }
    
    public float hitungGajiBersih() {
        float gaber;
        gaber = (float) (this.gajipokok + this.hitungTunjAnak
                (this.jmlAnak) + this.hitungTunjIstri(this.statusMenikah) 
                - this.hitungPotongan());
        return gaber;
    }
    
    public void simulasiAngsuranPinjaman() {
        float angsuran = 0, totalAngsuran = 0;
        int bulan;
        
        if ("IIIa".equals(this.gol)) {
            angsuran = (float)50000;
        }
        else if ("IIIb".equals(this.gol)) {
            angsuran = (float)100000;
        }
        else if ("IIIc".equals(this.gol)) {
            angsuran = (float)150000;
        }
        
        // menampilkan total pinjaman
        System.out.format("TOTAL PINJAMAN : Rp %10.1f \n", this.totPinjaman);
        
        // menampilkan ansuran perbulannya
        bulan = 0;
        while (totalAngsuran < this.totPinjaman) {
            totalAngsuran += angsuran;
            bulan++;
            System.out.format("ANGSURAN s/d BLN KE-%2d : Rp %10.1f \n", bulan, totalAngsuran);
        }
                
    }
    
}
