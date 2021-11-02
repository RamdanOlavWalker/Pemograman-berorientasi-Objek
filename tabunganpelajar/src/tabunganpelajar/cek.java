package tabunganpelajar;
public class cek{
    public static void main(String[] args)
    {
        Pelajar Mahasiswa = new Pelajar();
        Rekening NoRekening = new Rekening();
        Tabunganpelajar Tabungan = new Tabunganpelajar();
        
        Mahasiswa.setNamaOrang("Ramdan Umbara");
        Mahasiswa.setAlamatOrang("Kampung Babakan Teureup RT4/10 No.89 Bandung");
        Mahasiswa.setNoKTPOrang("3273260201xxxxxx");
        Mahasiswa.setNim("17200031");
        
        
        NoRekening.setRekening("4402 0001 0927 9090");
        NoRekening.Debet(500000);
        Tabungan.daftar(NoRekening, Mahasiswa);
        Tabungan.TampilanData();
        
        System.out.println("\n \n");
        NoRekening.Kredit(20000);
        Tabungan.daftar(NoRekening, Mahasiswa);
        Tabungan.TampilanData();
    }
}
