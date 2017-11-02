package com.example.tmp_sda_1119.myapplication.controller;

import android.widget.Toast;

/**
 * Created by tmp-sda-1119 on 11/2/17.
 */

public class ConverterController {


    public String checkDouble(String res) {

        double val = 0;
        val = Double.parseDouble(res);

        String result = String.valueOf(val);
        return result;
    }
}
