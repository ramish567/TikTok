package com.example.tooktook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.tooktook.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    ArrayList<Model> arrayList = new ArrayList<>();
  Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      binding = ActivityMainBinding.inflate(getLayoutInflater());
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);

      arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.a, R.drawable.ramish, "Ramish"));
      arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.b, R.drawable.ramish, "Ramish"));
      arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.c, R.drawable.ramish, "Ramish"));
      arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.d, R.drawable.ramish, "Ramish"));
      arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.e, R.drawable.ramish, "Ramish"));
      arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.f, R.drawable.ramish, "Ramish"));
      arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.g, R.drawable.ramish, "Ramish"));
      arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.h, R.drawable.ramish, "Ramish"));
      arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.i, R.drawable.ramish, "Ramish"));
      arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.j, R.drawable.ramish, "Ramish"));
      arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.k, R.drawable.ramish, "Ramish"));
      arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.l, R.drawable.ramish, "Ramish"));
      arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.m, R.drawable.ramish, "Ramish"));
      arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.n, R.drawable.ramish, "Ramish"));
      arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.o, R.drawable.ramish, "Ramish"));
      arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.p, R.drawable.ramish, "Ramish"));
      arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.q, R.drawable.ramish, "Ramish"));
      arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.r, R.drawable.ramish, "Ramish"));
      arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.s, R.drawable.ramish, "Ramish"));
      arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.t, R.drawable.ramish, "Ramish"));
      arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.u, R.drawable.ramish, "Ramish"));
      arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.v, R.drawable.ramish, "Ramish"));
      arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.w, R.drawable.ramish, "Ramish"));
      arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.x, R.drawable.ramish, "Ramish"));
      arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.y, R.drawable.ramish, "Ramish"));
      arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.z, R.drawable.ramish, "Ramish"));
      arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.ar, R.drawable.ramish, "Ramish"));

      adapter=new Adapter(MainActivity.this, arrayList);
      binding.Vpg2.setAdapter(adapter);
    }

}