package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {
    private int id;
    private String privinceName;
    private int privinceCode;


    public int getId() {
        return id;
    }

    public String getPrivinceName() {
        return privinceName;
    }

    public int getPrivinceCode() {
        return privinceCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrivinceName(String privinceName) {
        this.privinceName = privinceName;
    }

    public void setPrivinceCode(int privinceCode) {
        this.privinceCode = privinceCode;
    }
}
