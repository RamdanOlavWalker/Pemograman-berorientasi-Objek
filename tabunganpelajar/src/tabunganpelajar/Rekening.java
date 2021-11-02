
package tabunganpelajar;

public class Rekening {
    public double Saldo = 1000000;
    public String NoRekening;
    public double ceksaldo()
    {
        return 0;
    }
    void setRekening (String rekening)
    {
        NoRekening = rekening;
    }
    String getrekening()
    {
        return NoRekening;
    }
    double Debet(double Jumlah)
    { 
        Saldo+=Jumlah;
        return Saldo;
    }
    double Kredit(double Jumlah)
    {
        Saldo-=Jumlah;
        return Saldo;
    }
}
