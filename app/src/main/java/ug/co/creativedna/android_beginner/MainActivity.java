package ug.co.creativedna.android_beginner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText unit_price;

    EditText number_of_cups;
    TextView display_total;
    TextView display_no_cups;
    TextView display_unit_price;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coffe_app);
        findView();
    }

    private void findView(){
        unit_price = (EditText) findViewById(R.id.unit_price);
        number_of_cups = (EditText) findViewById(R.id.no_of_cups);
        display_no_cups = (TextView) findViewById(R.id.display_cups);
        display_total = (TextView) findViewById(R.id.display_total);
        display_unit_price = (TextView) findViewById(R.id.display_units);
    }


    public void submitAns(View view){
        Double unit_p =  Double.parseDouble(unit_price.getText().toString());
        Integer no_cups =  Integer.parseInt(number_of_cups.getText().toString());
        display_unit_price.setText(String.valueOf(unit_p));
        display_no_cups.setText(String.valueOf(no_cups));

        Double total = no_cups*unit_p;

        display_total.setText(String.valueOf(total));


    }



}
