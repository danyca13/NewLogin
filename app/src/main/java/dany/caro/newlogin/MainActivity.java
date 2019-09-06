package dany.caro.newlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextNombre, editTextPassword;
    Button botonIngreso;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //match de los widgets
        editTextNombre = findViewById(R.id.etNombre);
        editTextPassword = findViewById(R.id.etPassword);
        botonIngreso = findViewById(R.id.bntEntrar);

        botonIngreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombreUsuario = editTextNombre.getText().toString();
                String password = editTextNombre.getText().toString();

                if(nombreUsuario.isEmpty() || password.isEmpty()){
                    //nombre de usuario vacio

                }else{
                    if(nombreUsuario.equals("Caro") && password.equals("1397")){
                        //imprimir bienvenido
                        mensajito("Bienvendido!!!");
                    }else{
                        //imprimir datos erroneos
                        mensajito( "Los datos son erroneos");
                    }
                }

            }
        });



    }
    public void mensajito(String mensaje){
        Toast.makeText( this,mensaje,Toast.LENGTH_LONG).show();
    }
}
