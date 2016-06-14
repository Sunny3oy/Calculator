package gertnergroup.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "sunny";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button B9 = (Button)findViewById(R.id.B9);
        Button B8 = (Button)findViewById(R.id.B8);
        Button B7 = (Button)findViewById(R.id.B7);
        Button B6 = (Button)findViewById(R.id.B6);
        Button B5 = (Button)findViewById(R.id.B5);
        Button B4 = (Button)findViewById(R.id.B4);
        Button B3 = (Button)findViewById(R.id.B3);
        Button B2 = (Button)findViewById(R.id.B2);
        Button B1 = (Button)findViewById(R.id.B1);
        Button B0 = (Button)findViewById(R.id.B0);
        Button Plus = (Button)findViewById(R.id.Plus);
        Button sub = (Button)findViewById(R.id.sub);
        Button times = (Button)findViewById(R.id.times);
        Button over = (Button)findViewById(R.id.over);
        Button Clear = (Button)findViewById(R.id.Clear);
        Clear.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v) {
                        TextView num = (TextView)findViewById(R.id.num);
                        num.setText("");
                    }
                }
        );
        over.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v) {
                        TextView num = (TextView)findViewById(R.id.num);
                        num.setText(num.getText()+"/");
                    }
                }
        );
        times.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v) {
                        TextView num = (TextView)findViewById(R.id.num);
                        num.setText(num.getText()+"*");
                    }
                }
        );
        sub.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v) {
                        TextView num = (TextView)findViewById(R.id.num);
                        num.setText(num.getText()+"-");
                    }
                }
        );
        Plus.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v) {
                        TextView num = (TextView)findViewById(R.id.num);
                        num.setText(num.getText()+"+");
                    }
                }
        );

        B9.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v) {
                        TextView num = (TextView)findViewById(R.id.num);
                        num.setText(num.getText()+"9");
                    }
                }
        );
        B8.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v) {
                        TextView num = (TextView)findViewById(R.id.num);
                        num.setText(num.getText()+"8");
                    }
                }
        );
        B7.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v) {
                        TextView num = (TextView)findViewById(R.id.num);
                        num.setText(num.getText()+"7");
                    }
                }
        );
        B6.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v) {
                        TextView num = (TextView)findViewById(R.id.num);
                        num.setText(num.getText()+"6");
                    }
                }
        );
        B5.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v) {
                        TextView num = (TextView)findViewById(R.id.num);
                        num.setText(num.getText()+"5");
                    }
                }
        );
        B4.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v) {
                        TextView num = (TextView)findViewById(R.id.num);
                        num.setText(num.getText()+"4");
                    }
                }
        );
        B3.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v) {
                        TextView num = (TextView)findViewById(R.id.num);
                        num.setText(num.getText()+"3");
                    }
                }
        );
        B2.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v) {
                        TextView num = (TextView)findViewById(R.id.num);
                        num.setText(num.getText()+"2");
                    }
                }
        );
        B1.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v) {
                        TextView num = (TextView)findViewById(R.id.num);
                        num.setText(num.getText()+"1");
                    }
                }
        );
        B0.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v) {
                        TextView num = (TextView)findViewById(R.id.num);
                        num.setText(num.getText()+"0");
                    }
                }
        );



        Log.i(TAG, "OnCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "onSaveInstanceState");
    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "onRestoreInstanceState");
    }
}
