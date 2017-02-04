package br.com.avantagem.calcbasic;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    public void calcular(View view) {
        EditText ed1 = (EditText) findViewById(R.id.edValor1);
        EditText ed2 = (EditText) findViewById(R.id.edValor2);
        TextView tvRes = (TextView) findViewById(R.id.tvResultado);
        double vl1 = Double.parseDouble(ed1.getText().toString());
        double vl2 = Double.parseDouble(ed2.getText().toString());
        double res = 0.0;
        if (view.getId() == R.id.btMais) {
            res = vl1 + vl2;
            tvRes.setText(""+res);
        }
        else if (view.getId() == R.id.btDiv) {
            if (vl2 > 0) {
                res = vl1 / vl2;
                tvRes.setText("" + res);
            } else {
                tvRes.setText("Divisão por 0");
            }
        } else if (view.getId() == R.id.btMult) {
            res = vl1 * vl2;
            tvRes.setText(""+res);
        } else if (view.getId() == R.id.btMenos) {
            res = vl1 - vl2;
            tvRes.setText(""+res);
        }

    }
}
