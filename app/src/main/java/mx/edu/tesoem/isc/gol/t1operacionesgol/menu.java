package mx.edu.tesoem.isc.gol.t1operacionesgol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class menu extends AppCompatActivity {

    EditText vopcion;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        getSupportActionBar().hide();
        vopcion = (EditText) findViewById(R.id.txtopcion);

        btn =(Button) findViewById(R.id.envia);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String opt = vopcion.getText().toString();

                switch (opt) {

                    case "1":
                        Intent intent = new Intent(v.getContext(), suma.class);
                        startActivity(intent);
                        finish();
                        break;

                    case "2":
                        Intent intent2 = new Intent(v.getContext(), resta.class);
                        startActivity(intent2);
                        finish();
                        break;

                    case "3":
                        Intent intent3 = new Intent(v.getContext(), multiplicacion.class);
                        startActivity(intent3);
                        finish();
                        break;

                    case "4":
                        Intent intent4 = new Intent(v.getContext(), division.class);
                        startActivity(intent4);
                        finish();
                        break;

                    default:
                        Toast.makeText(menu.this, "Opción invalida", Toast.LENGTH_SHORT).show();


                }
            }
        });
    }
}
