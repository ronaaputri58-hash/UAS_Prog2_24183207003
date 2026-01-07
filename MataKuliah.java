public class MataKuliah {
    private String KodeMK;
    
    public MataKuliah(String KodeMK) {
        this.KodeMK = KodeMK;
    }
    
    public String KodeMK() { 
        return KodeMK; 
    }
    
    public void tampilInfo() {
        System.out.println("Kode MK : "+KodeMK);
    }
}