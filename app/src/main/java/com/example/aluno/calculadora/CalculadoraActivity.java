package com.example.aluno.calculadora;


import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;


public class CalculadoraActivity extends AppCompatActivity {
    EditText edNum1, edNum2;
    Button btSoma, btsubtrair, btmultiplicar, btdividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        edNum1 = (EditText) findViewById(R.id.ednumero1);
        edNum2 = (EditText) findViewById(R.id.ednumero2);
        btSoma = (Button) findViewById(R.id.btSoma);
        btsubtrair = (Button) findViewById(R.id.btsubtrair);
        btmultiplicar = (Button) findViewById(R.id.btmultiplicar);
        btdividir = (Button) findViewById(R.id.btdividir);

        btSoma.setOnClickListener(new View.OnClickListener() {


            @Override

            public void onClick(View v) {
                double num1 = Double.parseDouble(edNum1.getText().toString());
                double num2 = Double.parseDouble(edNum2.getText().toString());
                double soma = num1 + num2;
                AlertDialog.Builder dialago = new
                        AlertDialog.Builder(CalculadoraActivity.this);
                dialago.setTitle("Resultado Soma");
                dialago.setMessage("A soma é " + soma);
                dialago.setNeutralButton("ok", null);
                dialago.show();

            }
        });
        btsubtrair.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                double num1 = Double.parseDouble(edNum1.getText().toString());
                double num2 = Double.parseDouble(edNum2.getText().toString());
                double subtrair = num1 - num2;
                AlertDialog.Builder dialago = new
                        AlertDialog.Builder(CalculadoraActivity.this);
                dialago.setTitle("Resultado subtração");
                dialago.setMessage("A subtração é " + subtrair);
                dialago.setNeutralButton("ok", null);
                dialago.show();

            }
        });


        btmultiplicar.setOnClickListener(new View.OnClickListener() {


           public void onClick (View V) {
               double num1 = Double.parseDouble(edNum1.getText().toString());
               double num2 = Double.parseDouble(edNum2.getText().toString());
               double multiplicar = num1*num2;
               AlertDialog.Builder dialago = new AlertDialog.Builder(CalculadoraActivity.this);
               dialago.setTitle("Resultado multiplicação");
               dialago.setMessage("A multiplicação é " + multiplicar);
               dialago.setNeutralButton("ok", null);
               dialago.show();
        }
        });
        btdividir.setOnClickListener(new View.OnClickListener() {


                public void onClick(View v) {
                    double num1 = Double.parseDouble(edNum1.getText().toString());
                    double num2 = Double.parseDouble(edNum2.getText().toString());
                    double dividir = num1 / num2;
                    AlertDialog.Builder dialago = new
                            AlertDialog.Builder(CalculadoraActivity.this);
                    dialago.setTitle("Resultado dividir");
                    dialago.setMessage("A soma é " + dividir);
                    dialago.setNeutralButton("ok", null);
                    dialago.show();

                }

                 });
    }
}


