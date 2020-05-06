package com.example.qrcode;
//import android.databinding.ObservableBoolean;
//import android.databinding.ObservableField;
public class CodeGen {
 //public ObservableField<String> code = new ObservableField <>();
private String mCode;
public CodeGen (String code)
{
 mCode = code;
}
public String getCode(){return mCode;}
public void setCode(String code){mCode=code;}
}
