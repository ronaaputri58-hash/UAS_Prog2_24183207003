public abstract class User {
    String nama;
    
    public User(String nama){
        this.nama=nama;
    }
    
    public void tampil(){
        System.out.println("nama : " +nama);
    } 
    
    public abstract void tampilInfo();
}