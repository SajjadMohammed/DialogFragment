package com.sajjad.dialogfragment;

import android.content.DialogInterface;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView userName,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar supportToolbar=findViewById(R.id.supportv7_toolbar);
        setSupportActionBar(supportToolbar);

        userName=findViewById(R.id.userName);
         password=findViewById(R.id.password);

    }

    public void ShowDialogFragment(View view) {
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();

        final DialogFragment dialogFragment=new DialogFragment();
        Bundle arguments=new Bundle();
        arguments.putString("user_name","Sajjad");
        dialogFragment.setArguments(arguments);
        dialogFragment.show(fragmentTransaction,null);
    }
}
