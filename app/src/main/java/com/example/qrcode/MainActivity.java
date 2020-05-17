package com.example.qrcode;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.Toast;
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

import android.os.Bundle;

import com.example.qrcode.databinding.ActivityMainBinding;

import static android.app.PendingIntent.getActivity;

//import static java.security.AccessController.getContext;

public class MainActivity extends AppCompatActivity {
//private CodeGen mCodeGen= new CodeGen("ddd");

private CodeGen mCodeGen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mCodeGen = new CodeGen(getApplicationContext());
        mCodeGen.code.set("QWEW");
        binding.setCodegen(mCodeGen);
        //binding.setCodegen(mCodeGen);

    }

}
