package com.trung.thigkduquangtrung;

import java.io.Serializable;

public class MonAn implements Serializable {

    private String ten;
    private String mota;

    public MonAn(String ten, String mota) {
        this.ten = ten;
        this.mota = mota;
    }

    public String getTen() {
        return ten;
    }

    public String getMota() {
        return mota;
    }
}