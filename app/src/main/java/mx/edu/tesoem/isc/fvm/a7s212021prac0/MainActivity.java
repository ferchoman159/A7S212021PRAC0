package mx.edu.tesoem.isc.fvm.a7s212021prac0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static mx.edu.tesoem.isc.fvm.a7s212021prac0.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {

    EditText txtnom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);

        txtnom =findViewById(R.id.txtnombre);
    }
    public void saludo(View v){
        Toast.makeText(this, "Bienvenido a mi aplicacion" +" "+ txtnom.getText(), Toast.LENGTH_LONG).show();
    }
}