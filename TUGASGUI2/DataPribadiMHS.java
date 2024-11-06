package TUGASGUI2;

public class DataPribadiMHS {
    private String NIM, Nama, Alamat,Matkul;
    
    public DataPribadiMHS(String NIM, String Nama, String Alamat,String Matkul) {
     this.NIM = NIM;
     this.Nama = Nama;
     this.Alamat = Alamat;
     this.Matkul = Matkul;
    }
    public String getAlamat() {
     return Alamat;
    }
    public String getNIM() {
     return NIM;
    }
    public String getNama() {
     return Nama;
    }
    public String getMatkul(){
     return Matkul;
    }
}
