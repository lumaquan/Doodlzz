package com.example.luismauricio.doodlzz;

import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends LifecycleActivity {

    private String name = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.just_another);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Resources resources = getResources();
        Configuration configuration = resources.getConfiguration();
        int screenSize = configuration.screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK;
        int screenOrientation = configuration.orientation;

        Log.d("TAG", "density: " + configuration.densityDpi);
        Log.d("TAG", "width: " + configuration.screenWidthDp);
        Log.d("TAG", "height: " + configuration.screenHeightDp);
        Log.d("TAG", "smallest width: " + configuration.smallestScreenWidthDp);


        switch (screenSize){
            case Configuration.SCREENLAYOUT_SIZE_SMALL:
             toastMessage("small");
            break;
            case Configuration.SCREENLAYOUT_SIZE_NORMAL:
                toastMessage("normal");
                break;
            case Configuration.SCREENLAYOUT_SIZE_LARGE:
                toastMessage("large");
                break;
            case Configuration.SCREENLAYOUT_SIZE_XLARGE:
                toastMessage("xlarge");
                break;
            case Configuration.SCREENLAYOUT_SIZE_UNDEFINED:
                toastMessage("undefinied");
                break;
        }

        switch (screenOrientation){
            case Configuration.ORIENTATION_PORTRAIT:
                toastMessage("portrait");
                break;
            case Configuration.ORIENTATION_LANDSCAPE:
                toastMessage("landscape");
                break;
        }


        if(screenSize == Configuration.SCREENLAYOUT_SIZE_NORMAL){
               setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        }else{
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }

    }

    public void onOn(View view) {
        Toast.makeText(this, "Second version UP", Toast.LENGTH_SHORT).show();
    }


    private void toastMessage(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

}
