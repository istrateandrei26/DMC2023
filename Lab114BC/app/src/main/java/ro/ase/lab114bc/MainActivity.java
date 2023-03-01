package ro.ase.lab114bc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("lifecycle", "onCreate()");

        EditText etEUR = findViewById(R.id.editTextEUR);
        EditText etUSD = findViewById(R.id.editTextUSD);
        EditText etGBP = findViewById(R.id.editTextGBP);
        EditText etXAU = findViewById(R.id.editTextXAU);

        Button btnAfisare = findViewById(R.id.btnAfisare);
        btnAfisare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                etEUR.setText("4.9123");
                etUSD.setText("4.5678");
                etGBP.setText("5.2345");
                etXAU.setText("259.9567");

                Toast.makeText(getApplicationContext(), "Ai dat click pe buton!",
                        Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("lifecycle", "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("lifecycle", "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("lifecycle", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("lifecycle", "onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("lifecycle", "onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("lifecycle", "onDestroy()");
    }

    @Override
    public void onClick(View view) {

    }
}