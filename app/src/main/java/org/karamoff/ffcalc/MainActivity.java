package org.karamoff.ffcalc;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.math.BigDecimal;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        field = (EditText) findViewById(R.id.editText);
        field.setInputType(InputType.TYPE_NULL);

        select =  getResources().getColor(R.color.selected);

        plus = (Button) findViewById(R.id.buttonPlus);
        minus = (Button) findViewById(R.id.buttonMinus);
        mult = (Button) findViewById(R.id.buttonMult);
        div = (Button) findViewById(R.id.buttonDiv);
    }

    double operand1;
    double operand2;
    double result;
    boolean operation;
    int f;

    BigDecimal res;

    EditText field;

    int select;

    Button plus;
    Button minus;
    Button mult;
    Button div;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void Click0 (View v){
        String fieldText = field.getText().toString();
        fieldText += "0";
        field.setText(fieldText);
    }

    public void Click1 (View v){
        String fieldText = field.getText().toString();
        fieldText += "1";
        field.setText(fieldText);
    }

    public void Click2 (View v){
        String fieldText = field.getText().toString();
        fieldText += "2";
        field.setText(fieldText);
    }

    public void Click3 (View v){
        String fieldText = field.getText().toString();
        fieldText += "3";
        field.setText(fieldText);
    }

    public void Click4 (View v){
        String fieldText = field.getText().toString();
        fieldText += "4";
        field.setText(fieldText);
    }

    public void Click5 (View v){
        String fieldText = field.getText().toString();
        fieldText += "5";
        field.setText(fieldText);
    }

    public void Click6 (View v){
        String fieldText = field.getText().toString();
        fieldText += "6";
        field.setText(fieldText);
    }

    public void Click7 (View v){
        String fieldText = field.getText().toString();
        fieldText += "7";
        field.setText(fieldText);
    }

    public void Click8 (View v){
        String fieldText = field.getText().toString();
        fieldText += "8";
        field.setText(fieldText);
    }

    public void Click9 (View v){
        String fieldText = field.getText().toString();
        fieldText += "9";
        field.setText(fieldText);
    }

    public void ClickDot (View v){
        String fieldText = field.getText().toString();
        fieldText += ".";
        field.setText(fieldText);
    }

    public void ClickRes (View v){
        field.setText("");
        operand1 = 0;
        operand2 = 0;
        operation = false;

    }

    public void ClickPlus (View v){
        if (!operation){
            plus.setTextColor(select);
            minus.setTextColor(Color.BLACK);
            mult.setTextColor(Color.BLACK);
            div.setTextColor(Color.BLACK);

            operation = true;
            operand1 = Double.parseDouble(field.getText().toString());
            field.setText("");
            f=1;
        }
    }
    public void ClickMinus (View v){
        if (!operation){
            minus.setTextColor(select);
            plus.setTextColor(Color.BLACK);
            mult.setTextColor(Color.BLACK);
            div.setTextColor(Color.BLACK);

            operation = true;
            operand1 = Double.parseDouble(field.getText().toString());
            field.setText("");
            f=2;
        }
    }
    public void ClickMult (View v){
        if (!operation){
            mult.setTextColor(select);
            minus.setTextColor(Color.BLACK);
            plus.setTextColor(Color.BLACK);
            div.setTextColor(Color.BLACK);

            operation = true;
            operand1 = Double.parseDouble(field.getText().toString());
            field.setText("");
            f=3;
        }
    }
    public void ClickDiv (View v){
        if (!operation){
            div.setTextColor(select);
            minus.setTextColor(Color.BLACK);
            mult.setTextColor(Color.BLACK);
            plus.setTextColor(Color.BLACK);

            operation = true;
            operand1 = Double.parseDouble(field.getText().toString());
            field.setText("");
            f=4;
        }
    }

    public void ClickEq (View v){
        if (operation){
            div.setTextColor(Color.BLACK);
            minus.setTextColor(Color.BLACK);
            mult.setTextColor(Color.BLACK);
            plus.setTextColor(Color.BLACK);

            operand2 = Double.parseDouble(field.getText().toString());

            switch (f){
                case 1:
                    result = operand1+operand2;
                    break;
                case 2:
                    result = operand1-operand2;
                    break;
                case 3:
                    result = operand1*operand2;
                    break;
                case 4:
                    result = operand1/operand2;
                    break;
            }

            res = BigDecimal.valueOf(result);

            field.setText(String.valueOf(res));
            operation = false;
        }
    }
}
