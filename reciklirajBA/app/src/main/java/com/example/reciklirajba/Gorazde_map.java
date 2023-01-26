package com.example.reciklirajba;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.fragment.app.FragmentActivity;

import com.example.reciklirajba.databinding.ActivityGorazdeMapBinding;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Gorazde_map extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityGorazdeMapBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);

        binding = ActivityGorazdeMapBinding.inflate(getLayoutInflater());
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(binding.getRoot());


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        /* Banja Luka Markieri */

        //Emporium
        createMarker(44.776194, 17.186302);

        //Fis
        createMarker(44.816764, 17.209702);

        //Como
        createMarker(44.806567, 17.197751);

        //Univerzitet za poslovne studije
        createMarker(44.774739, 17.186433);

        //Škola učenika u prirodi
        createMarker(44.769024, 17.195754);

        //Katolički školski centar
        createMarker(44.770539, 17.194426);

        //Škola jezika PRIME
        createMarker(44.771458, 17.192585);

        //Park Mladen Stojanović
        createMarker(44.780553, 17.200786);

        //Park Petra Kočića
        createMarker(44.770516, 17.189074);

        //Park Bana Milosavljevića
        createMarker(44.771959, 17.192729);


        /* Mostar Markeri */

        //Treća osnovna škola
        createMarker(43.342998, 17.802445);

        //Srednja Prometna škola
        createMarker(43.349084, 17.808556);

        //Srednja elektrotehnička škola
        createMarker(43.346820, 17.800358);

        //Mepas Mall
        createMarker(43.348433, 17.804721);

        //UWC Mostar
        createMarker(43.342744, 17.807430);

        //Konzum
        createMarker(43.342390, 17.785219);

        //Veliki Park
        createMarker(43.343466, 17.805121);

        //Park u Centru II
        createMarker(43.349850, 17.806059);

        //Stadion pod Bijlim brijegom
        createMarker(43.345420, 17.794762);

        //Park Zrinjevac u Mostaru
        createMarker(43.341878, 17.803263);



        /* Sarajevo Markieri */

        //Vijećnica
        createMarker(43.859103, 18.433067);

        //Kapitol
        createMarker(43.859681, 18.421844);

        //Getetova
        createMarker(43.843798, 18.349484);

        //Kranjčevićeva
        createMarker(43.858087, 18.406316);

        //Narodno pozorište
        createMarker(43.857190, 18.420977);

        //Sarajevo City Center
        createMarker(43.855029, 18.407366);

        //Alta Shopping Centar
        createMarker(43.856272, 18.406528);

        //Botanic Garden
        createMarker(43.854730, 18.402199);

        //Safvet beg Bašagić
        createMarker(43.865223, 18.432062);

        //trg heroja
        createMarker(43.848497, 18.383447);


        /* Goražde Markeri */


        // HASIB HADZOVIC MARKER
        createMarker(43.663117, 18.974772);

        // DZEMAL BJEDIC MARKER
        createMarker(43.668734, 18.978788);

        // MSSEP marker
        LatLng MSSEP = new LatLng(43.664043, 18.973533);
        mMap.addMarker(new MarkerOptions().position(MSSEP).title("KANTE ZA RECIKLAŽU"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(MSSEP));

        float zoomLevel = 15.0f;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(MSSEP, zoomLevel));

    }


    public void createMarker(double lat, double lon) {
        LatLng marker = new LatLng(lat, lon);
        mMap.addMarker(new MarkerOptions().position(marker).title("KANTE ZA RECIKLAŽU"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(marker));
    }
}