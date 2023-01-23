package com.example.reciklirajba;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.Objects;

public class oznake_na_ambalazama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_oznake_na_ambalazama);

        Button recycleBut = (Button) findViewById(R.id.recycle);
        Button spinBut = (Button) findViewById(R.id.button4);
        Button pvcBut = (Button) findViewById(R.id.button5);
        Button reuseBut = (Button) findViewById(R.id.button6);
        Button manBut = (Button) findViewById(R.id.button7);
        Button notrashBut = (Button) findViewById(R.id.button8);

        //Recycle button
        recycleBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    showInfoDialog("MOBIUSOVA PETLJA \n (UNIVERZALNI SIMBOLI RECIKLIRANJA)", "Simbol sadrži tri povezane zaobljene strelice u obliku trougla. Strelice se međusobno nadovezuju i svaka predstavlja jedan ciklus reciklaže. Ako je Mobiusova petlja u krugu, označava proizvode dobivene reciklažom, a ponekad se unutar petlje nalazi postotak koji označava udio recikliranog materijala u proizvodu. \n");
            }
        });

        //swirl circle but thingy
        spinBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showInfoDialog("RECIKLIRAJ! \n (AMBALAŽA ZA RECIKLIRANJE)" , "Simbol nalazimo na većini proizvoda koji su pogodni za recikliranje. Kružni oblik simbola predstavlja samoodrživost procesa recikliranja, a sam simbol ima i varijaciju sa srcem koja ima isto značenje. " );
            }
        });
        //PVC BUTTON
        pvcBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showInfoDialog("KRATICE \n (SISTEM NUMERISANJA I KRATICA ZA OZNAČAVANJE AMBALAŽE)", "Princip numerisanja i kratica za označavanje ambalažnog materijala je vrlo jednostavan. Ispod simbola Mobiusove petlje nalazi se slovna skraćenica hemijskog spoja od kojeg je ambalaža proizvedena, dok se unutar petlje nalazi i brojčana oznaka. Kratice se pišu samo velikim slovima, a ako je unutar petlje samo broj bez kratice, radi se o kombinaciji materijala.");
            }
        });
        //zwlENA TOCKA
        reuseBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showInfoDialog("ZELENA TAČKA \n (DIO PROCESA RECIKLAŽE)", "Europski simbol kojim proizvođači i/ili dobavljači obavještavaju kupca da su finansijski pridonijeli i sudjelovali u recikliranju ambalaže proizvoda na kojem je simbol otisnut. Simbol ne znači da je ambalaža proizvoda nužno pogodna za recikliranje.");
            }
        });
        //manBut
        manBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showInfoDialog("ČUVAJMO OKOLIŠ \n (THE TIDYMAN)","Simbol predstavlja podsjetnik da vlastite otpatke odlažemo na za to predviđena mjesta." );
            }
        });
        //notrashBut
        notrashBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showInfoDialog("ODVOJENO SAKUPLJANJE OTPADA \n (PAŽLJIVO SA ELEKTRONSKIM OTPADOM)", "Simbol precrtane kante za smeće na proizvodu, bateriji ili ambalažnom materijalu označava da se svi električni i elektronički proizvodi, baterije i akumulatori nakon isteka vijeka trajanja moraju odložiti na odvojeno odlagalište. Ne bacajte proizvode s navedenom oznakom kao nerazvrstani gradski otpad, već ih odlažite na za to propisana mjesta!");

            }
        });

        
    }

    private void showInfoDialog(String tittle, String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(oznake_na_ambalazama.this, R.style.ThemeDialog);
        View view = LayoutInflater.from(oznake_na_ambalazama.this).inflate(
                R.layout.info_alert_mobus,(ConstraintLayout)findViewById(R.id.mobusDialog)
        );
        builder.setView(view);
        ((TextView) view.findViewById(R.id.textTitle)).setText(tittle);
        ((TextView) view.findViewById(R.id.textMessage)).setText(message);

        final AlertDialog alertDialog = builder.create();

        alertDialog.show();
    }

}