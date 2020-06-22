package com.example.cpgg;

import java.text.SimpleDateFormat;

public class tableLayout {

    int _SNo;
    int _CodeNo;
    String _iteam;
    String _type;
    String _criteria;
    float _cost;
    String _selected_shop;
    String _remark;
    public tableLayout(){   }
    public tableLayout(int SNo, int CodeNo, String iteam, String type, String criteria, float cost, String selected_shop,String remark ){
        this._SNo= SNo;
        this._CodeNo = CodeNo;
        this._iteam = iteam;
        this._type = type;
        this._criteria = criteria;
        this._cost = cost;
        this._selected_shop = selected_shop;
        this._remark = remark;
    }

    public tableLayout(String iteam, String type, String criteria, String selected_shop, String remark){
        this._iteam = iteam;
        this._type = type;
        this._criteria = criteria;
        this._selected_shop = selected_shop;
        this._remark = remark;
    }
    public int getSNO(){
        return this._SNo;
    }

    public void setSNO(int SNo){
        this._SNo = SNo;
    }

    public int getCODENO(){
        return this._CodeNo;
    }

    public void setCODENO(int CodeNo ){
        this._CodeNo = CodeNo;
    }

    public String getITEAM(){
        return this._iteam;
    }

    public void setITEAM(String iteam){
        this._iteam = iteam;
    }
    public String getTYPE(){
        return this._type;
    }

    public void setTYPE(String type){
        this._type = type;
    }
    public String getCRITERIA(){
        return this._criteria;
    }

    public void setCRITERIA(String criteria){
        this._criteria = criteria;
    }
    public float getCOST(){
        return this._cost;
    }

    public void setCOST(float cost){
        this._cost = cost;
    }
    public String getSELECTEDSHOP(){
        return this._selected_shop;
    }

    public void setSELECTEDSHOP(String selected_shop){
        this._selected_shop = selected_shop;
    }
    public String getREMARK(){
        return this._remark;
    }

    public void setREMARK(String remark){
        this._remark = remark;
    }
}
