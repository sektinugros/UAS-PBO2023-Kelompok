package UAS;
//Class Main
public class SenkuPhone implements PPNSmartphone {
    String vendor, tipe;
    double harga;
    
    //Penyusunan Constructor
    public SenkuPhone(String vendor, String tipe, double harga) {
        this.vendor = vendor;
        this.tipe = tipe;
        this.harga = harga;
    }
        
    // Getter and Setter untuk Variabel 
    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    //Perhitungan If - Else untuk mencari Total setelah dihitung PPN
    @Override
    public double perhitunganTotalPajak() {
        double hargaSetelahPPN;
         if (harga > 4500000){
            hargaSetelahPPN = harga + (harga * 0.05);
        }else if (harga >= 4200000 && harga <= 4500000){
            hargaSetelahPPN = harga + (harga * 0.02);
        }else if (harga > 4000000){
            hargaSetelahPPN = harga + (harga * 0.01);
        }else  {
            hargaSetelahPPN = harga;
        }
        return hargaSetelahPPN; 
    }
        //Mencetak Method dan Object
    public static void main(String[] args) {
        SenkuPhone samsung = new SenkuPhone("Samsung", "A54", 5000000);
        SenkuPhone oppo = new SenkuPhone("Oppo", "Reno5", 4400000);
        SenkuPhone xiaomi = new SenkuPhone("Xiaomi", "4A", 4100000);
        
        //Mencetak dan Menampilkan
        System.out.println("________________________________");
        System.out.println(" Vendor /  Tipe  / Harga Setelah PPN ");
        System.out.println("================================|");
        System.out.println( samsung.getVendor()+ " |  " + samsung.getTipe()+ "   |  " + samsung.perhitunganTotalPajak()+"   |");
        System.out.println("________________________________|");
        System.out.println( oppo.getVendor()+ "    |  " + oppo.getTipe()+ " |  " + oppo.perhitunganTotalPajak()+"   |");
        System.out.println("________________________________|");
        System.out.println( xiaomi.getVendor()+ "  |  " + xiaomi.getTipe()+ "    |  " + xiaomi.perhitunganTotalPajak()+"   |");
        System.out.println("--------------------------------|");
    }    
}
