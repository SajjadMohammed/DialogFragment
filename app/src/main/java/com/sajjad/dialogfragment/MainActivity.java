package com.sajjad.dialogfragment;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar supportToolbar=findViewById(R.id.supportv7_toolbar);
        setSupportActionBar(supportToolbar);



    }

    public void ShowDialogFragment(View view) {
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();

        DialogFragment dialogFragment=new DialogFragment();
        dialogFragment.show(fragmentTransaction,null);
    }
}
