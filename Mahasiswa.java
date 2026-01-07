public class Mahasiswa extends User {
    private String npm;

    public Mahasiswa(String nama, String npm) {
        super(nama);
        this.npm = npm;
    }
    
    public String getNpm() { 
        return npm; }
    public void setNpm(String npm) { 
        this.npm = npm; }
    
   @Override
   public void tampilInfo() {
       super.tampil();
       System.out.println("npm   : "+npm);
    }
}