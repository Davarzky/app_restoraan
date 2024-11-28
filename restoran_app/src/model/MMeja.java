/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Client
 */
public class MMeja {
    private String id_meja;
    private String nama_meja;
    private String status;

    public MMeja(String id_meja, String nama_meja, String status) {
        this.id_meja = id_meja;
        this.nama_meja = nama_meja;
        this.status = status;
    }

    public String getId_meja() {
        return id_meja;
    }

    public void setId_meja(String id_meja) {
        this.id_meja = id_meja;
    }

    public String getNama_meja() {
        return nama_meja;
    }

    public void setNama_meja(String nama_meja) {
        this.nama_meja = nama_meja;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
