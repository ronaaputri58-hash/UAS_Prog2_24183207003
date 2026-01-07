public class Nilai implements Penilaian {
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    

    public Nilai(double tugas, double uts ,double uas) {
        this.nilaiTugas = tugas;
        this.nilaiUTS = uts;
        this.nilaiUAS = uas;
    }
    
    @Override
    public double hitungNilaiAkhir() {
    double nilaiakhir; 
        nilaiakhir = (0.4 * nilaiTugas) + (0.3 * nilaiUTS) + (0.3 * nilaiUAS);
        return nilaiakhir;
    }
}
    
