package gertnergroup.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button plus,sub,muti,div;
    private TextView result;
    private EditText doge1,doge2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        plus = (Button)findViewById(R.id.plus);
        sub = (Button)findViewById(R.id.sub);
        muti = (Button)findViewById(R.id.muti);
        div = (Button)findViewById(R.id.div);
        result = (TextView)findViewById(R.id.result);
        doge1 = (EditText)findViewById(R.id.doge1);
        doge2 = (EditText)findViewById(R.id.doge2);

        plus.setOnClickListener(this);
        sub.setOnClickListener(this);
        muti.setOnClickListener(this);
        div.setOnClickListener(this);
    }
    public void onClick(View v) {
        String number1 = doge1.getText().toString();
        String number2 = doge2.getText().toString();
    switch (v.getId()){
        case R.id.plus:
            double adding = Double.parseDouble(number1)+Double.parseDouble(number2);
            result.setText(String.valueOf(adding));
            break;
        case R.id.sub:
            double sub = Double.parseDouble(number1)-Double.parseDouble(number2);
            result.setText(String.valueOf(sub));
            break;
        case R.id.muti:
            double muti = Double.parseDouble(number1)*Double.parseDouble(number2);
            result.setText(String.valueOf(muti));
            break;
        case R.id.div:
            if(Objects.equals(number2, "0")) {
                result.setText("Doge cannot divide by 0, Doge will explode, such danger!");
                break;
            }
            double div = Double.parseDouble(number1) / Double.parseDouble(number2);
            result.setText(String.valueOf(div));
            break;
    }
    }
}

