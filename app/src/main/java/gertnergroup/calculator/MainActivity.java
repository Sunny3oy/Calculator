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
    //widgets and text declearations
    private Button plus,sub,muti,div;
    private TextView result;
    private EditText doge1,doge2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();//user defined function to hold all inits
    }

    private void init() {
        //linking each corresponding id to the correct names
        plus = (Button)findViewById(R.id.plus);
        sub = (Button)findViewById(R.id.sub);
        muti = (Button)findViewById(R.id.muti);
        div = (Button)findViewById(R.id.div);
        result = (TextView)findViewById(R.id.result);
        doge1 = (EditText)findViewById(R.id.doge1);
        doge2 = (EditText)findViewById(R.id.doge2);
        //these are the buttons, they dont do anything until you click on them
        plus.setOnClickListener(this);
        sub.setOnClickListener(this);
        muti.setOnClickListener(this);
        div.setOnClickListener(this);
    }
    //once a button is pressed, this function will check which button id was clicked
    public void onClick(View v) {
        String number1 = doge1.getText().toString();//changing from a text to string variable
        String number2 = doge2.getText().toString();
        //below is a switch statement
    switch (v.getId()){
        case R.id.plus:
            double adding = Double.parseDouble(number1)+Double.parseDouble(number2);//we parse our
            // string into a double so we can do math with it
            result.setText(String.valueOf(adding));//we use this function "String.valueOf" to convert our
            // double value back to a string value and then using the setText function to "cout"to results
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
            //below if statement check if the user inputs 0 as the 2nd doge number.
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

