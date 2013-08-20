
package gajikaryawan;

import java.io.*;

public class inputConsole {
    // baca data string
    public String bacaString(){
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in), 1);
        String string = "";
        
        try {
            string = bfr.readLine();
        }
        catch(IOException ex) {
            System.out.println(ex);
        }
        return string;
    }
    
    // baca data integer
    public int bacaInt() {
        return Integer.parseInt(bacaString());
    }
    
    // baca data float
    public float bacaFloat() {
        return Float.parseFloat(bacaString());
    }
    
    // baca data long
    public long bacaLong() {
        return Long.parseLong(bacaString());
    }
        
    // mekanisme method-method untuk membaca input dari berbagai tipe data
    // membaca setiap input dalam bentuk string kemudian input string diubah ke tipe data yang bersesuaian
}
