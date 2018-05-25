package pooa2018.iff.br.trabalho01220181;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.RadioButton;


public class MainActivity extends AppCompatActivity {

    private EditText txtHoras;
    private EditText txtFaltas;
    private EditText txtFilhos;
    private TextView txtResultado;
    private Button btnCalcular;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHoras = (EditText) findViewById(R.id.tHoras);
        txtFaltas = (EditText) findViewById(R.id.tFaltas);
        txtFilhos = (EditText) findViewById(R.id.tFilhos);
        txtResultado = (TextView) findViewById(R.id.lResposta);

        btnCalcular = (Button) findViewById(R.id.bCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override

                public void onRadioButtonClicked(View view) {

                    boolean checked = ((RadioButton) view).isChecked();

                    switch(view.getId()) {

                        case R.id.radio_Gerente:
                            if (checked)
                                calcularGerente();
                                break;
                        case R.id.radio_Supervisor:
                            if (checked)
                                calcularSupervisor();
                            break;
                        case R.id.radio_Servente:
                            if (checked)
                                calcularServente();
                            break;
                    }
                }
                   });

    }



    private void calcularGerente(){

        float total_horas = Float.parseFloat(txtHoras.getText().toString());
        int total_faltas = Integer.parseInt(txtFaltas.getText().toString());
        int total_filhos = Integer.parseInt(txtFilhos.getText().toString());

        float salario_base = 2000;




    }

    private void calcularSupervisor(){

        float total_horas = Float.parseFloat(txtHoras.getText().toString());
        int total_faltas = Integer.parseInt(txtFaltas.getText().toString());
        int total_filhos = Integer.parseInt(txtFilhos.getText().toString());




    }

    private void calcularServente(){

        float total_horas = Float.parseFloat(txtHoras.getText().toString());
        int total_faltas = Integer.parseInt(txtFaltas.getText().toString());
        int total_filhos = Integer.parseInt(txtFilhos.getText().toString());




    }

}
