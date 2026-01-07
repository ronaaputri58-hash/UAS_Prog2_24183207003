public class Dosen extends User {
    private String id;

    public Dosen(String nama,String id) {
        super(nama);
        this.id = id;
    }

    @Override
    public void tampilInfo() {
        System.out.println("Nama Dosen  : " + nama);
        System.out.println("ID Dosen  : " + id);
    }    
}