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
 public ObservableField<Bitmap> QRImg = new ObservableField<>();
//private String mCode;
/*public CodeGen (String code)
{
 mCode = code;
}*/
//public String getCode(){return mCode;}
//public void setCode(String code){mCode=code;}
private Context ctx;
private Bitmap bitmap ;
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
  else
  {
      try {
          //if (bitmap==null){Toast.makeText(ctx, "Ноль.", Toast.LENGTH_SHORT).show();}
           bitmap = TextToImageEncode(s);
           QRImg.set(bitmap);
          //iv.setImageBitmap(bitmap);
      }
      catch (WriterException e)
      {
          Toast.makeText(ctx, "Ошибка.", Toast.LENGTH_SHORT).show();
      }
      Toast.makeText(ctx, "Готовим код", Toast.LENGTH_SHORT).show();
  }
  }
    private Bitmap TextToImageEncode(String Value) throws WriterException {
        BitMatrix bitMatrix;
        try {
            bitMatrix = new MultiFormatWriter().encode(
                    Value,
                    BarcodeFormat.DATA_MATRIX.QR_CODE,
                    500, 500, null
            );

        } catch (IllegalArgumentException Illegalargumentexception) {

            return null;
        }
        int bitMatrixWidth = bitMatrix.getWidth();

        int bitMatrixHeight = bitMatrix.getHeight();

        int[] pixels = new int[bitMatrixWidth * bitMatrixHeight];

        for (int y = 0; y < bitMatrixHeight; y++) {
            int offset = y * bitMatrixWidth;

            for (int x = 0; x < bitMatrixWidth; x++) {

                 pixels[offset + x] = bitMatrix.get(x, y) ?
                        ctx.getResources().getColor(R.color.black):ctx.getResources().getColor(R.color.white);

            }
        }
        Bitmap bitmap = Bitmap.createBitmap(bitMatrixWidth, bitMatrixHeight, Bitmap.Config.ARGB_4444);

        bitmap.setPixels(pixels, 0, 500, 0, 0, bitMatrixWidth, bitMatrixHeight);
        return bitmap;
    }
}
