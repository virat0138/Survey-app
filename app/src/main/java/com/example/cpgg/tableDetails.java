package com.example.cpgg;

public class tableDetails {

    public class Info {
        int _Ph;
        int _id;
        String _name;
        String _shopname;

        String _address1,_address2,_landmark, _state,_city;
        int _pincode;
        String _district;
        String _block;
        public Info(){   }
        public Info(int Ph ,String name,String shopname,int _id,String address1,String address2,String landmark,String state,String city,int pincode,String district,String block ){
            this._Ph= Ph;
            this._name = name;
            this._shopname = shopname;
            this._id = _id;
            this._address1 = address1;
            this._address2 = address2;
            this._landmark= landmark;
            this._city = city;
            this._pincode = pincode;
            this._district = district;
            this._block = block;

        }

        public int getPH(){
            return this._Ph;
        }

        public void setPH(int Ph){
            this._Ph = Ph;
        }

        public String getNAME(){
            return this._name;
        }

        public void setNAME(String name ){
            this._name = name;
        }

        public String getSHOPNAME(){
            return this._shopname;
        }

        public void setSHOPNAME(String shopname){
            this._shopname = shopname;
        }
        public String getADDRESS1(){
            return this._address1;
        }

        public void setADDRESS1(String address1){
            this._address1 = address1;
        }
        public String getADDRESS2(){
            return this._address2;
        }

        public void setADDRESS2(String address2){
            this._address2 = address2;
        }
        public String getLANDMARK(){
            return this._landmark;
        }

        public void setLANDMARK(String landmark){
            this._landmark = landmark;
        }
        public String getCITY(){
            return this._city;
        }

        public void setCITY(String city){
            this._city = city;
        }
        public int getPINCODE(){
            return this._pincode;
        }

        public void setPINCODE(int pincode){
            this._pincode = pincode;
        }
        public String getDISTRIT(){
            return this._district;
        }

        public void setDISTRICT(String district){
            this._district = district;
        }
        public String getBLOCK(){
            return this._block;
        }

        public void setBLOCK(String block){
            this._block = block;
        }

    }
}
