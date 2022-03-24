package com.example.tp2_splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this,"Create",Toast.LENGTH_LONG).show();
        Intent intent=new Intent( this,SplashActivity.class);
        Button button=findViewById(R.id.button);
        View view = null;
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void
            onClick(View v) {
                Envoyer(view);
            }});
    }
    public void Envoyer(View view){
        EditText
                usernametxt=(EditText)findViewById(R.id.etusername);
        EditText
                passwordtxt=(EditText)findViewById(R.id.etpassword);
        TextView
                usernametv=(TextView)findViewById(R.id.tvusername);
        TextView
                passwordtv=(TextView)findViewById(R.id.tvPassword);
        Intent myInent=new Intent(this,MainActivity2.class);
        Bundle b=new Bundle();

        b.putString("username",usernametxt.getText().toString());

        b.putString("password",passwordtxt.getText().toString());

        b.putString("tvusername",usernametv.getText().toString());

        b.putString("tvpassword",passwordtv.getText().toString());
        myInent.putExtras(b);
        startActivity(myInent);
    }
    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(this,"Start",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(this,"Resume",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(this,"Restart",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(this,"Pause",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"Stop",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(this,"Destroy",Toast.LENGTH_LONG).show();
    }
}
