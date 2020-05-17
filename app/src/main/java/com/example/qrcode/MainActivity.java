package com.example.qrcode;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Menu;
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
private Toolbar toolbar;
private CodeGen mCodeGen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        toolbar = (Toolbar) findViewById(R.id.toolbar);



       // getSupportActionBar().setTitle("@string/menu_hystory");
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mCodeGen = new CodeGen(getApplicationContext());
        mCodeGen.code.set("QWEW");
        binding.setCodegen(mCodeGen);
        //binding.toolbar.setTitle("@string/menu_hystory");
        setSupportActionBar(binding.toolbar);
        if (getSupportActionBar()==null) {

            Toast.makeText(MainActivity.this, "Ошибка.", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(MainActivity.this, "Не НОЛЬ!!!.", Toast.LENGTH_SHORT).show();

        }
        //binding.setCodegen(mCodeGen);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.topmenu, menu);
        return true;
    }


}
