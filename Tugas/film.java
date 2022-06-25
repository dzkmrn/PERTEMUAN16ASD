package Tugas;

public class film {
    String id, judul, tahun, director;

    public film(String id, String judul, String tahun, String director){
        this.id = id;
        this.judul = judul;
        this.tahun = tahun;
        this.director = director;
    }
    public String toString(){
        return "FILM {Id Film= "+id +", Judul FIlm= "+judul+", Tahun Tayang= "+tahun+", Director= "+director+"}";
    }
}
