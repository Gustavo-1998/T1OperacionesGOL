package mx.edu.tesoem.isc.gol.t1operacionesgol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class multiplicacion extends AppCompatActivity implements View.OnClickListener {

    EditText et1, et2;
    TextView tv1;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicacion);

        getSupportActionBar().hide();

        et1 = (EditText) findViewById(R.id.txtnum1);
        et2 = (EditText) findViewById(R.id.txtnum2);
        tv1 = (TextView) findViewById(R.id.lbldivision);

        btn1 = (Button) findViewById(R.id.regresa);
        btn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent pantalla1= new Intent(this,menu.class);
        startActivity(pantalla1);
        finish();
    }

    //Metodo que realiza multiplicacion

    public void Multiplicar(View view)
    {

        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int numero1 = Integer.parseInt(valor1);
        int numero2 = Integer.parseInt(valor2);
        int multi = numero1 * numero2;

        String resultado = String.valueOf(multi);
        tv1.setText(resultado);

    }
}
