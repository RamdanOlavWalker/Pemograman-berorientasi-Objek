
package tabunganpelajar;

public class Tabunganpelajar {
    public Rekening Rekeningku;
    public Pelajar nasabah;
    
    void daftar (Rekening Rekeningnasabah, Pelajar nasabahbaru)
    {
        Rekeningku = Rekeningnasabah;
        nasabah = nasabahbaru;
    }
    public double ceksaldo()
    {
        return Rekeningku.ceksaldo();
    }
    void TampilanData()
    {
        System.out.println("Data Nasabah");
        System.out.println("Nama : "+nasabah.getNamaOrang());
        System.out.println("Alamat : "+nasabah.getAlamatOrang());
        System.out.println("NoKTP : "+nasabah.getNoKTPOrang());
        System.out.println("NIM : "+nasabah.getNIM());
        
        System.out.println("Data Tabungan");
        System.out.println("NoRekening : "+Rekeningku.getrekening());
        System.out.println("Saldo Tabungan :"+Rekeningku.ceksaldo());
    }
}
