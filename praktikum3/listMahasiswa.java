package praktikum3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class listMahasiswa {
    List<mahasiswa> mahasiswas = new ArrayList<>();
    public void tambah(mahasiswa... Mahasiswa){
        mahasiswas.addAll(Arrays.asList(Mahasiswa));
    }public void hapus(int index){
    mahasiswas.remove(index);
    }public void update(int index, mahasiswa mhs){
    mahasiswas.set(index, mhs);
    }public void tampil(){
    mahasiswas.stream().forEach(mhs -> {
        System.out.println(""+ mhs.toString());
    });   
}

int linearSearch(String nim){
    for(int i=0; i<mahasiswas.size(); i++){
        if(nim.equals(mahasiswas.get(i).nim)){
            return i;
        }
    }
    return -1;
}

public static void main(String[] args) {
    listMahasiswa lm = new listMahasiswa();
    mahasiswa m = new mahasiswa("201234", "Noureen", "021xx1");
    mahasiswa m1 = new mahasiswa("201235", "Akhleema", "021xx2");
    mahasiswa m2 = new mahasiswa("201236", "Shannum", "021xx3");
    //menambahkan objek mahasiswa
    lm.tambah(m, m1, m2);
    //menampilkan list mahasiswa
    lm.tampil();
    //update mahasiswa
    lm.update(lm.linearSearch("201235"), new mahasiswa("201235", "Akhleema Lela", "021xx2"));
    System.out.println("");
    lm.tampil();
} 
}
