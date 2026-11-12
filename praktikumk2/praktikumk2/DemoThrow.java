package praktikumk2;

public class DemoThrow {
    public static void main(String[] args) {
        DataMhs obj = new DataMhs();
        obj.setNim(null);
        obj.setNama("Joko");
        obj.setNilai(80);

        System.out.println("NIM : " + obj.getNim());
        System.out.println("Nama : " + obj.getNama());
        System.out.println("Nilai : " + obj.getNilai());
    }
}
