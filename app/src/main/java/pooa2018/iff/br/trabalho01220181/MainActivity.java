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
            public void onClick(View v) {
                onRadioButtonClicked(v);
            }

                public void onRadioButtonClicked(View view) {

                    boolean checked = ((RadioButton) view).isChecked();

                    switch(view.getId()) {

                        case R.id.radio_Gerente:
                            if (checked)
                                calcular(2000);
                                break;
                        case R.id.radio_Supervisor:
                            if (checked)
                                calcular(900);
                            break;
                        case R.id.radio_Servente:
                            if (checked)
                                calcular(300);
                            break;
                    }
                }
                   });

    }



    private void calcular(float salario_base){

        float total_horas = Float.parseFloat(txtHoras.getText().toString());
        int total_faltas = Integer.parseInt(txtFaltas.getText().toString());
        int total_filhos = Integer.parseInt(txtFilhos.getText().toString());

        float valor_extra, valor_falta, valor_filhos, valor_inss, valor_proventos, valor_descontos, salario_liquido;

        valor_extra = ((salario_base/240)*2)*total_horas;
        valor_falta = (salario_base/30)*total_faltas;
        valor_filhos = ((salario_base*3)/100) * total_filhos;

        valor_proventos = salario_base + valor_extra + valor_filhos;

        valor_inss = (valor_proventos*10)/100;
        valor_descontos = (valor_falta + valor_inss);

        salario_liquido = (valor_proventos - valor_descontos);

        String mensagem = "O valor total de PROVENTOS é de R$"+valor_proventos+". \nO valor total de DESCONTOS é de R$"+valor_descontos+".\n Ovalor finall do SALÁRIO LÍQUIDO é de R$"+salario_liquido+".";

        txtResultado.setText(String.valueOf(mensagem));


    }

    }
