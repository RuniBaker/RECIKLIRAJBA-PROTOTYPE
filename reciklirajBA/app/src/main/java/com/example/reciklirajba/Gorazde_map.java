package com.example.reciklirajba;

import android.os.Bundle;
import android.view.WindowManager;

import androidx.fragment.app.FragmentActivity;

import com.example.reciklirajba.databinding.ActivityGorazdeMapBinding;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;

public class Gorazde_map extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityGorazdeMapBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityGorazdeMapBinding.inflate(getLayoutInflater());
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // MSSEP marker
        LatLng MSSEP = new LatLng(43.664043, 18.973533);
        mMap.addMarker(new MarkerOptions().position(MSSEP).title("KANTE ZA RECIKLAŽU"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(MSSEP));

        // HASIB HADZOVIC MARKER
        LatLng HASIBHADZ = new LatLng(43.663117, 18.974772);
        mMap.addMarker(new MarkerOptions().position(HASIBHADZ).title("KANTE ZA RECIKLAŽU"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(HASIBHADZ));

        // DZEMAL BJEDIC MARKER
        LatLng DZEMALBJED = new LatLng(43.668734, 18.978788);
        mMap.addMarker(new MarkerOptions().position(DZEMALBJED).title("KANTE ZA RECIKLAŽU"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(DZEMALBJED));

        float zoomLevel = 15.0f; //This goes up to 21
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(MSSEP, zoomLevel));

        LatLngBounds GORAZDE = new LatLngBounds(
                new LatLng(43.657616, 18.952702), new LatLng(43.660595, 18.989768));

        mMap.moveCamera(CameraUpdateFactory.newLatLngBounds(GORAZDE, 0));

    }
}