package com.app.practica_6_controles;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ActvBoton extends AppCompatActivity
//        implements View.OnClickListener
{

    public static String[] SITIOS_MOVIL = {
            "Max Android",
            "Miriado Z",
            "Movil IA",
            "MUX",
            "Master en Android",
            "Minimun IOs Shippable",
            "Melody Movil"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.actv_boton);
        setContentView(R.layout.activity_material);
//        findViewById(R.id.btn1).setOnClickListener(this);
//        findViewById(R.id.btn2).setOnClickListener(this);
//        findViewById(R.id.btn3).setOnClickListener(this);
//        findViewById(R.id.btn4).setOnClickListener(this);


//        final EditText et1 = findViewById(R.id.et1);
//        EditText et2 = findViewById(R.id.et2);




//        et1.setOnEditorActionListener(new TextView.OnEditorActionListener() {
//            @Override
//            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
//                if (actionId == EditorInfo.IME_ACTION_SEARCH)
//                {
////                    mostrar mensaje:
//                    Toast.makeText(ActvBoton.this, "Buscar : " + v.getText().toString(),
//                            Toast.LENGTH_LONG).show();
////                    ocultar teclado virtual:
//                    InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
//                    imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
//                    return true;
//                }
//                return false;
//            }
//        });



//        et1.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//                TextView tv = findViewById(R.id.tv);
//                tv.setText(String.valueOf(et1.length()));
//            }
//        });



//        Log.d("Posición cursor:", String.valueOf(et1.getSelectionEnd()));
//
//        EditText campoDescuento = findViewById(R.id.campo_descuento);
//        campoDescuento.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View v, boolean hasFocus) {
//                ImageView icon = findViewById(R.id.icon);
//
//                if(hasFocus)
//                    icon.getDrawable().setTint(ContextCompat.getColor(
//                            ActvBoton.this, R.color.colorAccent));
//            }
//        });

        AutoCompleteTextView actv = findViewById(R.id.actv);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_dropdown_item_1line, SITIOS_MOVIL);
        actv.setAdapter(adapter);
    }

//    public void verValor(View view)
//    {
//        EditText et = findViewById(R.id.et);
//        Log.d("Valor ET", et.getText().toString());
//    }

//    @Override
//    public void onClick(View v) {
////        Intent i = new Intent(ActvBoton.this, Actividad_Nueva.class);
////        startActivity(i);
////
//        int color = 0;
//        View container = v.getRootView();
//        switch(v.getId())
//        {
//            case R.id.btn1:
//                color = Color.parseColor("#80CBC4");
//                break;
//            case R.id.btn2:
//                color = Color.parseColor("#A5D6A7");
//                break;
//            case R.id.btn3:
//                color = Color.parseColor("#C5E1A5");
//                break;
//            case R.id.btn4:
//                color = Color.parseColor("#E6EE9C");
//                break;
//        }
//        container.setBackgroundColor(color);
//    }

//    public void cambiarMensaje(View v)
//    {
//        TextView et = findViewById(R.id.et);
//        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
//        Date fechaActual = Calendar.getInstance().getTime();
//
//        String s = format.format(fechaActual);
//        et.setText(String.format("Boton presionado: %s", s));
//
//    }
}
