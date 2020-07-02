package Model;

public class Pesanan 
{
    private Integer Id_pesanan;
    private String Nama_pesanan;
    private Integer Harga_pesanan;
    
    public Integer getId_pesanan() {
        return Id_pesanan;
    }

    public void setId_pesanan(Integer Id_pesanan) {
        this.Id_pesanan = Id_pesanan;
    }

    public String getNama_pesanan() {
        return Nama_pesanan;
    }

    public void setNama_pesanan(String Nama_pesanan) {
        this.Nama_pesanan = Nama_pesanan;
    }
    
    public Integer getHarga_pesanan() {
        return Harga_pesanan;
    }

    public void setHarga_pesanan(Integer Harga_pesanan) {
        this.Harga_pesanan = Harga_pesanan;
    }
}
