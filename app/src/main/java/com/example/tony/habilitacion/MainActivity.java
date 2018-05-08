package com.example.tony.habilitacion;

import android.app.FragmentManager;
import android.app.ListFragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import com.google.android.gms.maps.MapFragment;

public class MainActivity extends AppCompatActivity {

    private Button b1, b2, b3;
    private RadioButton rb1, rb2;

    private listaDeFranquicias sucursales = new listaDeFranquicias();
    private mapaFranquicias mapa = new mapaFranquicias();
    FragmentManager manejador = getFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }




}

