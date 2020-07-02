package Controller;

import Koneksi.Koneksi;
import Model.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControllerTransaksi 
{
    Koneksi Koneksi;
    ArrayList<Pelanggan> arrPelanggan;
    ArrayList<Pesanan> arrPesanan;
    ArrayList<Transaksi> arrTransaksi;
    
    public ControllerTransaksi() throws SQLException
    {
        Koneksi = new Koneksi();
        arrPelanggan = new ArrayList<>();
        arrPesanan = new ArrayList<>();
        arrTransaksi = new ArrayList<>();
    }
    
    public ArrayList<Pelanggan> getDataPelanggan() throws SQLException
    {
        arrPelanggan.clear();
        ResultSet rs = Koneksi.GetData("SELECT * FROM PELANGGAN");
        while (rs.next())
        {
            Pelanggan p = new Pelanggan();
            p.setId_pelanggan(rs.getInt("ID_PELANGGAN"));
            p.setNama_pelanggan(rs.getString("NAMA_PELANGGAN"));
            
            arrPelanggan.add(p);
        }
        return arrPelanggan;
    }
    
    public ArrayList<Pesanan> getDataPesanan() throws SQLException
    {
        arrPesanan.clear();
        ResultSet rs = Koneksi.GetData("SELECT * FROM PESANAN");
        while (rs.next())
        {
            Pesanan p = new Pesanan();
            p.setId_pesanan(rs.getInt("ID_PESANAN"));
            p.setNama_pesanan(rs.getString("NAMA_PESANAN"));
            p.setHarga_pesanan(rs.getInt("HARGA_PESANAN"));
            
            arrPesanan.add(p);
        }
        return arrPesanan;
    }
    
    public ArrayList<Transaksi> getDataTransaksi() throws SQLException
    {
        arrTransaksi.clear();
        ResultSet rs = Koneksi.GetData("SELECT * FROM TRANSAKSI JOIN PESANAN ON TRANSAKSI.ID_PESANAN = PESANAN.ID_PESANAN JOIN PELANGGAN ON TRANSAKSI.ID_PELANGGAN = PELANGGAN.ID_PELANGGAN");
        while (rs.next())
        {
            Pesanan p = new Pesanan();
            p.setId_pesanan(rs.getInt("ID_PESANAN"));
            p.setNama_pesanan(rs.getString("NAMA_PESANAN"));
            p.setHarga_pesanan(rs.getInt("HARGA_PESANAN"));
            
            Pelanggan psl = new Pelanggan();
            psl.setId_pelanggan(rs.getInt("ID_PELANGGAN"));
            psl.setNama_pelanggan(rs.getString("NAMA_PELANGGAN"));
            
            Transaksi t = new Transaksi();
            t.setId_transaksi(rs.getInt("ID_TRANSAKSI"));
            t.setJumlah_pesanan(rs.getInt("JUMLAH_PESANAN"));
            t.setTotal_harga(rs.getInt("TOTAL_HARGA"));
            t.setBayar(rs.getInt("BAYAR"));
            t.setKembalian(rs.getInt("KEMBALIAN"));
            
            arrTransaksi.add(t);
        }
        return arrTransaksi;
    }
    
    public void insertTransaksi (Transaksi t)
    {
        try {
            this.Koneksi.ManipulasiData("INSERT INTO TRANSAKSI VALUES (ID_TRANSAKSI.NEXTVAL," 
                    + t.getPesanan().getId_pesanan() + ","
                    + t.getPelanggan().getId_pelanggan() + ",'"
                    + t.getJumlah_pesanan()+ "','" 
                    + t.getTotal_Harga()+ "','"
                    + t.getBayar()+ "','" 
                    + t.getKembalian()+ "')");
            ResultSet rs = this.Koneksi.GetData("SELECT ID_TRANSAKSI.CURRVAL FROM DUAL");
            System.out.println(rs);
            rs.next();
            int Id_transaksi = rs.getInt("CURRVAL");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        /*try{
            Koneksi.ManipulasiData("INSERT INTO TRANSAKSI VALUES (ID_TRANSAKSI.NEXTVAL,'"
                    + t.getJumlah_pesanan() + "',"
                    + t.getTotal_Harga() + "," 
                    + t.getBayar() + "," 
                    + t.getKembalian() + ")");
            ResultSet rs = Koneksi.GetData("SELECT ID_TRANSAKSI.CURRVAL FROM DUAL");
            System.out.println(rs);
            rs.next();
            int Id_transaksi = rs.getInt("CURRVAL");

        } catch (SQLException ex) {
            Logger.getLogger(ControllerTransaksi.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }
    
    public void insertPesanan (Pesanan p)
    {
        try{
            Koneksi.ManipulasiData("INSERT INTO PESANAN VALUES (ID_PESANAN.NEXTVAL,'" + p.getNama_pesanan() + "'," + p.getHarga_pesanan() + ")");
            ResultSet rs = this.Koneksi.GetData("SELECT ID_PESANAN.CURRVAL FROM DUAL");
            System.out.println(rs);
            rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(ControllerTransaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updatePesanan(Pesanan p,int Harga_pesanan){
        Koneksi.ManipulasiData("UPDATE PESANAN SET HARGA_PESANAN = " + Harga_pesanan + "WHERE ID_PESANAN = " + p.getId_pesanan());
    }
    
    public void deletePesanan(Pesanan p) {
        Koneksi.ManipulasiData("DELETE FROM PESANAN WHERE ID_PESANAN = " + p.getId_pesanan());
    }
    
    public void insertPelanggan (Pelanggan p)
    {
        try{
            Koneksi.ManipulasiData("INSERT INTO PELANGGAN VALUES (ID_PELANGGAN.NEXTVAL,'"+ p.getNama_pelanggan() + "')");
            ResultSet rs = Koneksi.GetData("SELECT ID_PELANGGAN.CURRVAL FROM DUAL");
            System.out.println(rs);
            rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(ControllerTransaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deletePelanggan(Pelanggan p) {
        Koneksi.ManipulasiData("DELETE FROM PELANGGAN WHERE ID_PELANGGAN = " + p.getId_pelanggan());
    }
}
