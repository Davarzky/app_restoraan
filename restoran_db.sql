use restoran_app;

CREATE TABLE user (
    id_user VARCHAR(50) NOT NULL PRIMARY KEY,
    nama_user VARCHAR(50) DEFAULT NULL,
    username VARCHAR(50) DEFAULT NULL,
    password VARCHAR(50) DEFAULT NULL,
    role ENUM('admin', 'kasir', 'waiter', 'owner') DEFAULT NULL
);
create table pelanggan(
    id_pelanggan VARCHAR(50) PRIMARY KEY,
    nama_pelanggan VARCHAR(100),
    jenis_kelamin ENUM("L","P"),
    noHp VARCHAR(13),
    alamat VARCHAR(100)
);
create table menu(
    id_menu VARCHAR(50) PRIMARY KEY,
    nama_menu VARCHAR(100),
    harga INT

);

create table pesanan(
    id_pesanan BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    id_menu VARCHAR(50),
    id_pelanggan VARCHAR(50),
    id_user VARCHAR(50),
    jumlah TINYINT(4),
    FOREIGN KEY (id_menu) REFERENCES menu(id_menu)ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (id_pelanggan) REFERENCES pelanggan(id_pelanggan) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (id_user) REFERENCES user(id_user)ON DELETE CASCADE ON UPDATE CASCADE


);
create table transaksi(
    id_transaksi VARCHAR(100) PRIMARY KEY,
    id_pesanan BIGINT(20),
    total BIGINT(20),
    bayar BIGINT(20),
    FOREIGN KEY (id_pesanan) REFERENCES pesanan(id_pesanan) ON DELETE CASCADE on UPDATE CASCADE

);
create table meja(
    id_meja VARCHAR(50)PRIMARY KEY,
    nama_meja VARCHAR(100)
);
alter TABLE pesanan add FOREIGN KEY (id_meja) REFERENCES meja(id_meja) ON DELETE CASCADE ON UPDATE CASCADE

