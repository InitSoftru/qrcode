package com.example.qrcode;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.qrcode.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
//private CodeGen mCodeGen= new CodeGen("ddd");
private CodeGen mCodeGen= new CodeGen();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mCodeGen.code.set("QWEW");
        binding.setCodegen(mCodeGen);
        //binding.setCodegen(mCodeGen);

    }
}
