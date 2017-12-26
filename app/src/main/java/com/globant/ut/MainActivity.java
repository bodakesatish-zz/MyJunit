package com.globant.ut;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MainViewInterface{

    private MainPresenter presenter;
    public PreferenceManager preferenceManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preferenceManager = new PreferenceManager();
        presenter = new MainPresenter(this, preferenceManager);
        presenter.calculateSomeThing(10,20);
    }

    @Override
    public void onCalculationComplete(int ans) {
        Log.i("UT", "Answer is ->"+ans);
    }

    @Override
    public void showHomeActivity() {

    }

    @Override
    public void showLoginActivity() {

    }
}
