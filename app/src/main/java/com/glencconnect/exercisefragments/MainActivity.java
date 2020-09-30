package com.glencconnect.exercisefragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static final String CURRENT_FRAGMENT = "viewpager_saved";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPageFragment savedFragment = (ViewPageFragment) getSupportFragmentManager().findFragmentByTag(CURRENT_FRAGMENT);

        if (savedFragment == null) {
            ViewPageFragment fragment = new ViewPageFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.placeholder, fragment,CURRENT_FRAGMENT);
            fragmentTransaction.commit();
        }
    }
}
