package com.example.data;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Data {
    private @Id @GeneratedValue Long id;
    private Long    isbn;
    private String judul;
    private String penerbit;
    private String tahun;
    private Long   harga;

    Data() {
    }

    Data(Long isbn, String judul, String penerbit, String tahun, Long harga) {
        this.isbn = isbn;
        this.judul = judul;
        this.penerbit = penerbit;
        this.tahun = tahun;
        this.harga = harga;
    }

    public Long getId() {
        return this.id;
    }

    public Long getIsbn() {
        return this.isbn;
    }

    public String getJudul() {
        return this.judul;
    }

    public String getPenerbit() {
        return this.penerbit;
    }

    public String getTahun() {
        return this.tahun;
    }

    public Long getHarga() {
        return this.harga;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public void setHarga(Long harga) {
        this.harga = harga;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Data))
            return false;
        Data data = (Data) o;
        return Objects.equals(this.id, data.id)
                && Objects.equals(this.isbn, data.isbn) && Objects.equals(this.judul, data.judul)
                && Objects.equals(this.penerbit, data.penerbit) && Objects.equals(this.tahun, data.tahun)
                && Objects.equals(this.harga, data.harga);

    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.isbn, this.judul, this.penerbit, this.tahun, this.harga);
    }

    @Override
    public String toString() {
        return "Data Buku {" + "id=" + this.id + ", ISBN='" + this.isbn + '\'' + ", Judul='" + this.judul + '\''
                + ", Penerbit='" + this.penerbit + '\'' + ", Tahun='" + this.tahun + '\'' + ", Harga='"
                + this.harga + '}';
    }

}
