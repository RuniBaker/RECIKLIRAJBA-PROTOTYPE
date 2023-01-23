package com.example.reciklirajba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.WindowManager;
import android.widget.TextView;

public class kategorija_otpada extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategorija_otpada);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        String blueMessage = "•\tnovine, časopisi, katalozi;" + "\n" + "•\tsveske, knjige, slikovnice;" + "\n" + "•\tpisaći i kompjuterski papir, pisma, papirnate vrećice;" + "\n" +
                "•\tpisaći i kompjuterski papir, pisma, papirnate vrećice" + "\n"  + "(bez ljepljive trake, plastike, stiropora i dr.)." + "\n\n" + "U plave kontejnere ne smiju se odlagati indigo papir, ugljeni papir, fotografije i foto papir, zauljeni i prljavi papir,gumirane etikete, pelene i sl.";

        String greenMessage = "U zelene kontejnere ne smiju se odlagati:" + "\n" + "•\tprozorsko staklo, automobilsko staklo, kristalno " + "\n" + " i optičko staklo, armirano staklo, staklena vuna;"
                + "\n" + "•\tsijalice i fluorescentne svjetiljke;" + "\n" + "•\tporculanski i keramički predmeti." + "\n\n" + "Ravno prozorsko staklo se odlaže isključivo u reciklažna dvorišta.";

        String yellowMessage = "•\tplastične vrećice, folije, mjehurasta ambalaža;" + "\n" + "•\tplastične boce od jestivog ulja, destilirane vode,sredstava za čišćenje i pranje, kozmetike, lijekova, prehrambenih proizvoda;" + "\n" + "•\tčaše i posude od jogurta, sira;" + "\n" + "•\tpjenasta i zaštitna ambalaža za razne prehrambene proizvode;"
                + "\n" + "•\tostali proizvodi od plastike: boce od sokova, čepovi, plastični tanjiri, pribor za jelo." + "\n\n" + "Metalna ambalaža se, također, odlaže u žute kontejnere."  ;

        TextView blueText = findViewById(R.id.blueText);
        TextView greenText = findViewById(R.id.greenText);
        TextView yellowText = findViewById(R.id.yellowText);

        blueText.setText(blueMessage);
        greenText.setText(greenMessage);
        yellowText.setText(yellowMessage);


    }
}