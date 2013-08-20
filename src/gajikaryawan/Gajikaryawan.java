
package gajikaryawan;

public class Gajikaryawan {

    public static void main(String[] args) {

        String nama, kodekar;
        int gapok, jmlanak;
        float gaber, tunjangan;
        
        inputConsole input1 = new inputConsole();
        
        // input kode karyawan
        System.out.println("KODE KARYAWAN : ");
        kodekar = input1.bacaString();
        
        // input nama karyawan
        System.out.println("NAMA KARYAWAN : ");
        nama = input1.bacaString();
        
        // input gaji pokok
        System.out.println("GAJI POKOK : ");
        gapok = input1.bacaInt();
        
        // input jumlah anak
        System.out.println("JUMLAH ANAK : ");
        jmlanak = input1.bacaInt();
        
        // hitung tunjangan anak, setiap anak 10% dari gaji pokok
        tunjangan = (float) ((float)gapok * 0.1 * jmlanak);
        
        // hitung gaji bersih
        gaber = gapok + tunjangan;
        
        // output
        System.out.println("NAMA KARYAWAN : " +nama+ "(" +kodekar+ ")");
        System.out.println("GAJI BERSIH : Rp : " +gaber);
    }
}
