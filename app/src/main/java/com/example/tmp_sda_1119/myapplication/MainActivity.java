package com.example.tmp_sda_1119.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.tmp_sda_1119.myapplication.controller.ConverterController;

public class MainActivity extends AppCompatActivity {

    private ConverterController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        controller = new ConverterController();
    }

    
    public void click(View component){
        // to access a id of a component
        EditText textArea = (EditText) findViewById(R.id.input_val);
        //l = R.id.button;
        String res = textArea.getText().toString();




        if(component.getId() == R.id.button) {



            String result ;
            //exception handling
            try{
                result = controller.checkDouble(res);
                
            } catch(NumberFormatException ex)
            {
                Toast tt2 = Toast.makeText(this, ex.getMessage(), Toast.LENGTH_LONG);
                tt2.show();
                return;
            }

             Toast tt = Toast.makeText(this, res, Toast.LENGTH_LONG);
             tt.show();


        }
        else {

            // its a msg box
            Toast tt1 = Toast.makeText(this, "Hellooooooooooo", Toast.LENGTH_LONG);
            tt1.show();
        }



    }
}
