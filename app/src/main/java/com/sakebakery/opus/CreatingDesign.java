package com.sakebakery.opus;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.CheckBox;

public class CreatingDesign extends AppCompatActivity {

    Spinner s1;
    Spinner s2;
    Spinner s3;
    Spinner s4;
    Spinner s5;

    String[] bankNames = {"Strawberry", "Oreo", "Milk Chocolate", "Vanilla", "Tiramisu", "Mocha"};
    String[] icing = {"Chocolate", "Vanilla", "Strawberry", "Taro"};
    String[] side={"Jelly Beans", "Glitters"};
    String[] filling={"Whipped Cream", "Chocolate Custard", "Vanilla Custard", "Strawberry Mousse", "Fruit Custard", "Vanilla Pudding"};
    String[] filling2={"0.5 kg","1 kg","1.5 kg", "2 kg"};

    CheckBox flowers, fruits, Strawberries, photo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creating_design);
        flowers = (CheckBox)findViewById(R.id.checkBox);
        fruits = (CheckBox)findViewById(R.id.checkBox2);
        Strawberries = (CheckBox)findViewById(R.id.checkBox3);
        photo = (CheckBox)findViewById(R.id.checkBox4);

        s1=(Spinner) findViewById(R.id.simpleSpinner);
        s2=(Spinner) findViewById(R.id.icing);
        s3=(Spinner) findViewById(R.id.sidedeco);
        s4=(Spinner) findViewById(R.id.filling);
        s5=(Spinner) findViewById(R.id.filling2);

        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, bankNames);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            s1.setAdapter(aa);
       // AdapterView.OnItemClickListener onItemClickListener = ;
        s1.setOnItemSelectedListener(new OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
              //  ((TextView) parent.getChildAt(0)).setTextColor(Color.MAGENTA);
                ((TextView) parent.getChildAt(0)).setTextSize(15);

                int get=s1.getSelectedItemPosition();
             //   Toast.makeText(getApplicationContext(), bankNames[get], Toast.LENGTH_LONG).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        //Icing
        ArrayAdapter<String> bb = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, icing);
        bb.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s2.setAdapter(bb);
        s2.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        //    ((TextView) parent.getChildAt(0)).setTextColor(Color.MAGENTA);
            ((TextView) parent.getChildAt(0)).setTextSize(15);
//                int get=s2.getSelectedItemPosition();
               // Toast.makeText(getApplicationContext(), icing[get], Toast.LENGTH_LONG).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        ArrayAdapter<String> cc = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, side);
        cc.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s3.setAdapter(cc);
        s3.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int get=s3.getSelectedItemPosition();
                ((TextView) parent.getChildAt(0)).setTextSize(15);
              //  Toast.makeText(getApplicationContext(), side[get], Toast.LENGTH_LONG).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        ArrayAdapter<String> dd = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, filling);
        dd.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s4.setAdapter(dd);
        s4.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int get=s4.getSelectedItemPosition();
                ((TextView) parent.getChildAt(0)).setTextSize(15);
               // Toast.makeText(getApplicationContext(), filling[get], Toast.LENGTH_LONG).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        ArrayAdapter<String> ee = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, filling2);
        ee.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s5.setAdapter(ee);
        s5.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int get=s5.getSelectedItemPosition();
                ((TextView) parent.getChildAt(0)).setTextSize(15);
              //  Toast.makeText(getApplicationContext(), filling2[get], Toast.LENGTH_LONG).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });


        }



//
//    @Override
//    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
//
//        if (arg0.getId() == R.id.simpleSpinner) {
//
//            Spinner spin = (Spinner) findViewById(R.id.simpleSpinner);
//            spin.setAdapter(aa);
//            spin.setOnItemSelectedListener(this);
//            ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, bankNames);
//            aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//            spin.setAdapter(aa);
//            Toast.makeText(getApplicationContext(), bankNames[position], Toast.LENGTH_LONG).show();
//        }
//        else if (arg0.getId() == R.id.icing){
//            Spinner spin = (Spinner) findViewById(R.id.icing);
//            spin.setOnItemSelectedListener(this);
//            ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item ,icing);
//            aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//            spin.setAdapter(aa);
//            Toast.makeText(getApplicationContext(),icing[position], Toast.LENGTH_LONG).show();
//        }
//        else if (arg0.getId() == R.id.sidedeco){
//            Spinner spin = (Spinner) findViewById(R.id.sidedeco);
//            spin.setOnItemSelectedListener(this);
//            ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item ,side);
//            aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//            spin.setAdapter(aa);
//            Toast.makeText(getApplicationContext(),side[position], Toast.LENGTH_LONG).show();
//        }
//        else if (arg0.getId() == R.id.filling){
//            Spinner spin = (Spinner) findViewById(R.id.filling);
//            spin.setOnItemSelectedListener(this);
//            ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item ,filling);
//            aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//            spin.setAdapter(aa);
//            Toast.makeText(getApplicationContext(),filling[position], Toast.LENGTH_LONG).show();
//        }
//        else if (arg0.getId() == R.id.filling2){
//            Spinner spin = (Spinner) findViewById(R.id.filling2);
//            spin.setOnItemSelectedListener(this);
//            ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item ,filling2);
//            aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//            spin.setAdapter(aa);
//            Toast.makeText(getApplicationContext(),filling2[position], Toast.LENGTH_LONG).show();
//        }
//    }
//    @Override
//    public void onNothingSelected(AdapterView<?> arg0) {
//// TODO Auto-generated method stub
//    }

//        Button btn = (Button)findViewById(R.id.getBtn);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String result = "Selected Courses";
//                if(android.isChecked()){
//                    result += "\nAndroid";
//                }
//                if(angular.isChecked()){
//                    result += "\nAngularJS";
//                }
//                if(java.isChecked()){
//                    result += "\nJava";
//                }
//                if(python.isChecked()){
//                    result += "\nPython";
//                }
//                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
//            }
//        });

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        String str="";
        switch(view.getId()) {
            case R.id.checkBox:
                str = checked?"Flowers Selected":"Flowers Deselected";
                break;
            case R.id.checkBox2:
                str = checked?"Fruits Selected":"Fruits Deselected";
                break;
            case R.id.checkBox3:
                str = checked?"Strawberries Selected":"Strawberries Deselected";
                break;
            case R.id.checkBox4:
                str = checked?"Photo Selected":"Photo Deselected";
                break;
        }
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
    }
}
