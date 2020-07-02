CREATE TABLESPACE fadel_07012
datafile 'C:\Kuliah\Semester 4\Basdat\Modul 1\sistem_informasi_penjualan_nasi_bungkus.dbf'
size 30M;

CREATE USER faruqfadel_07012
IDENTIFIED BY fadel
DEFAULT TABLESPACE fadel_07012
QUOTA 30M ON fadel_07012;


create table Pesanan
(
Id_pesanan	INTEGER not null,
Nama_pesanan	VARCHAR(20),
Harga_pesanan	NUMBER(9),
constraint PK_Pesanan primary key (Id_pesanan)
);

create table Pelanggan
(
Id_pelanggan	INTEGER not null,
Nama_pelanggan	VARCHAR(20),
constraint PK_Pelanggan primary key (Id_pelanggan)
);

create Transaksi
(
Id_transaksi	INTEGER not null,
Id_pesanan	INTEGER,
Id_pelanggan	INTEGER,
total_harga	NUMBER(9),
jumlah_pesanan	NUMBER(10),
bayar		NUMBER(9),
kembalian	NUMBER(9),
constraint PK_Transaksi primary key (Id_transaksi)
);

alter table Transaksi
add constraint FK_Id_pesanan FOREIGN KEY (Id_pesanan)
references Pesanan (Id_pesanan)
add constraint FK_Id_pelanggan FOREIGN KEY (Id_pelanggan)
references Pelanggan (Id_pelanggan);

create sequence Id_pesanan
minvalue 1
maxvalue 9999
start with 1
increment by 1
nocache;

create sequence Id_pelanggan
minvalue 1
maxvalue 9999
start with 1
increment by 1
nocache;

create sequence Id_transaksi
minvalue 1
maxvalue 9999
start with 1
increment by 1
nocache;

SELECT * FROM TRANSAKSI JOIN PESANAN ON TRANSAKSI.ID_PESANAN = PESANAN.ID_PESANAN JOIN PELANGGAN ON TRANSAKSI.ID_PELANGGAN = PELANGGAN.ID_PELANGGAN
 			
create view Nama_pelanggan as
select b.Nama_pelanggan, a.Nama_pesanan
from Pesanan a join
Pelanggan b
on a.Id_pesanan = b.Id_pelanggan;

create view Jumlah_pesanan as
select b.Nama_pelanggan, a.Nama_pesanan, c.Jumlah_pesanan, c.Total_harga
from Pesanan a
left join Pelanggan b
left join Transaksi c
on b.Id_pelanggan = c.Id_transaksi
on a.Id_pesanan = c.Id_transaksi;

create view Harga_pesanan as
select b.Nama_pelanggan, a.Nama_pesanan, a.Harga_pesanan, c.Jumlah_pesanan, c.Total_harga
from Transaksi c right join Pesanan a
on c.Id_pesanan = a.Id_pesanan
right join Pelanggan b
on c.Id_pelanggan = b.Id_pelanggan
where Harga_pesanan <= (select max(Harga_pesanan) from Transaksi)
OR Harga_pesanan >= (select min(Harga_pesanan) from Transaksi);
