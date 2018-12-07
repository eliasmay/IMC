package com.mayelias.android.imc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText campoPeso;
    private EditText campoEstatura;
    private Button botonCalcular;
    private Button botonLimpiar;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoPeso = (EditText) findViewById(R.id.editText_Peso);
        campoEstatura = (EditText) findViewById(R.id.editText_estatura);
        botonCalcular = (Button) findViewById(R.id.button_calcular);
        botonLimpiar = (Button) findViewById(R.id.button_limpiar);
        textoResultado = (TextView) findViewById(R.id.textView_resultado);

        botonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = campoPeso.getText().toString();
                double peso = Double.parseDouble(s);
                String r = campoEstatura.getText().toString();
                double estatura = Double.parseDouble(r);
                double imc = peso / (Math.pow(estatura,2));
                String resultado = Double.toString(imc);
                textoResultado.setText(resultado);

            }
        });
        botonLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                campoPeso.setText("");
                campoEstatura.setText("");
                textoResultado.setText("0.0");
            }
        });

    }
}
