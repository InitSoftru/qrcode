package com.example.qrcode;

import androidx.appcompat.app.AppCompatActivity;

//import android.databinding.ObservableBoolean;
import android.view.View;
import android.app.Activity;
import android.app.Fragment;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.widget.Toast;
import android.content.Context;
import android.view.View;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
 //import static java.security.AccessController.getContext;
//import static android.app.PendingIntent.getActivity;
import androidx.databinding.ObservableField;
public class CodeGen extends AppCompatActivity {

 public ObservableField<String> code = new ObservableField <>();
//private String mCode;
/*public CodeGen (String code)
{
 mCode = code;
}*/
//public String getCode(){return mCode;}
//public void setCode(String code){mCode=code;}
private Context ctx;
    public CodeGen(Context ctx){
        this.ctx = ctx;
    }
 public void GenerateQR (View v)
 {
  Integer i;
  String s =  code.get();
  i=s.length();

  if(i == 0){

      Toast.makeText(ctx, "Введите код.", Toast.LENGTH_SHORT).show();
  }
  }
}
