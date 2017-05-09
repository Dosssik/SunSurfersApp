package ru.sunsurfers.sunapp;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar bar = getSupportActionBar();

        bar.setDisplayHomeAsUpEnabled(true);
        bar.setDisplayShowHomeEnabled(true);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(33.586374, -5.320341)));

        mMap.addMarker(new MarkerOptions().position(new LatLng(33.586374, -5.320341)).title("Марат Хасанов"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(7.824406, 98.359843)).title("Andrey Dotcenko"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-52.295489, -72.127905)).title("Nikita Melnikov"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-8.976318, -55.248531)).title("Александр Мазалецкий"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.580119, -1.771904)).title("Арина Охлопкова"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(40.513497, 45.915010)).title("Kati Aronson"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-25.585703, 131.564527)).title("Андрей Лаптев"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-24.313407, 117.448916)).title("Тоня Сотникова"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(20.422818, -101.127433)).title("Murad Rogozhnikov"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-23.198391, 16.294856)).title("Ник Файн"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(3.116369, 103.029701)).title("Рушана"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(6.700451, 81.407079)).title("Владимир Путин"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(32.045037, 34.865850)).title("Саша Шистеров"));
    }
}
