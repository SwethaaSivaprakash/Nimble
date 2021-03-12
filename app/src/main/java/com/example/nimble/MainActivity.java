package com.example.nimble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {

        switch (item.getItemId())
        {
            case R.id.menu_login:
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
                return true;

            case R.id.menu_reg:
                Intent intent1 = new Intent(MainActivity.this, RegistrationActivity.class);
                startActivity(intent1);
                return true;

            case R.id.menu_feed:
                Intent intent2 = new Intent(MainActivity.this, Feedback.class);
                startActivity(intent2);
                return true;

            case R.id.menu_about:
                Intent intent3 = new Intent(MainActivity.this, Details.class);
                startActivity(intent3);
                return true;


            default:
                return super.onOptionsItemSelected(item);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView register = (TextView)findViewById(R.id.lnkRegister);
        register.setMovementMethod(LinkMovementMethod.getInstance());
        register.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegistrationActivity.class);
                startActivity(intent);
            }



        });

    }
}