package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "data_sekolah")
public class SekolahModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nama_sekolah")
    private String nama_sekolah;

    @Column(name = "alamat_sekolah")
    private String alamat_sekolah;

    @Column(name = "no_telepon")
    private String no_telepon;

    @Column(name = "email_sekolah")
    private String email_sekolah;

    @Column(name = "motto")
    private String motto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama_sekolah() {
        return nama_sekolah;
    }

    public void setNama_sekolah(String nama_sekolah) {
        this.nama_sekolah = nama_sekolah;
    }

    public String getAlamat_sekolah() {
        return alamat_sekolah;
    }

    public void setAlamat_sekolah(String alamat_sekolah) {
        this.alamat_sekolah = alamat_sekolah;
    }

    public String getNo_telepon() {
        return no_telepon;
    }

    public void setNo_telepon(String no_telepon) {
        this.no_telepon = no_telepon;
    }

    public String getEmail_sekolah() {
        return email_sekolah;
    }

    public void setEmail_sekolah(String email_sekolah) {
        this.email_sekolah = email_sekolah;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }
}
