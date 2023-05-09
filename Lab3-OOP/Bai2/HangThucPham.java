/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.time.LocalDate;

/**
 *
 * @author ADMIN
 */
public class HangThucPham {
    private String maHang;
    private String tenHang;
    private double soLuongTon;
    private double donGia;
    private LocalDate NSX;
    private LocalDate NHH;
    private String nhaCungCap;

    public HangThucPham() {
    }

    public HangThucPham(String maHang, String tenHang, double soLuongTon, double donGia, LocalDate NSX, LocalDate NHH, String nhaCungCap) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuongTon = soLuongTon;
        this.donGia = donGia;
        this.NSX = NSX;
        this.NHH = NHH;
        this.nhaCungCap = nhaCungCap;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public double getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(double soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public LocalDate getNSX() {
        return NSX;
    }

    public void setNSX(LocalDate NSX) {
        this.NSX = NSX;
    }

    public LocalDate getNHH() {
        return NHH;
    }

    public void setNHH(LocalDate NHH) {
        this.NHH = NHH;
    }

    public String getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    @Override
    public String toString() {
        return "HangThucPham{" + "maHang=" + maHang + ", tenHang=" + tenHang + ", soLuongTon=" + soLuongTon + ", donGia=" + donGia + ", NSX=" + NSX + ", NHH=" + NHH + ", nhaCungCap=" + nhaCungCap + '}';
    }
    
}
