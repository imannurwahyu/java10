package TUGASGUI2;

import java.util.ArrayList;

public class InputDataMHS {
    ArrayList<DataPribadiMHS> listmahasiswa;
     public InputDataMHS() {
     listmahasiswa = new ArrayList ();
     }
     public void insertData(String NIM, String Nama, String Alamat, String Matkul) {
     DataPribadiMHS mhs = new DataPribadiMHS(NIM, Nama, Alamat, Matkul);
     listmahasiswa.add(mhs);
    }
     public ArrayList<DataPribadiMHS> getALL() {
    return listmahasiswa;
    }

    public void deleteData(int index) {
    listmahasiswa.remove(index);
    }
}
