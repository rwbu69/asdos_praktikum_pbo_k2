package praktikumk2;

public class DataMhs {
    private String nim;
    private String nama;
    private double nilai;

    public void setNim(String vnim) {
        try {
            nim = vnim;
            if (nim == null) {
                throw new NullPointerException();
            }
        } catch (NullPointerException npe) {
            System.out.println("Kesalahan :" + "Nim Mahasiswa tidak boleh Null");
        }
    }

    public String getNim() {
        return nim;
    }

    public void setNama(String vnama) {
        try {
            nama = vnama;
            if (nama == null){
                throw new NullPointerException();
            } 
        } catch (NullPointerException npe) {
            System.out.println("Kesalahan :" + "Nama Mahasiswa tidak boleh null");
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNilai(int vnilai) {
        nilai = vnilai;
    }

    public double getNilai() {
        return nilai;
    }

    
}
