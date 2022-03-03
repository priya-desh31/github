package com.example.github;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1;
    EditText ed1,ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button)findViewById(R.id.button);
        ed1 = (EditText)findViewById(R.id.edittext1);
        ed2 = (EditText)findViewById(R.id.edittext2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed1.getText().toString().equals("priyanka55shelar@gmail.com")  && ed2.getText().toString().equals("Priyanka.d123") )
                {
                    Intent intent=new Intent(MainActivity.this,login.class);
                   startActivity(intent);

                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Incorrect credentials",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}