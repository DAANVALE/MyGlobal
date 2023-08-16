package com.example.myglobal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.Lottie;

public class Video_Activity extends AppCompatActivity {

    private TextView tvtitle, tvdescription, tvcategory;
    private RadioGroup radioGroup;
    private CheckBox checkBox;
    private LinearLayout layout_payment;
    private ImageView img;
    private Button btn_order;

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        tvtitle = (TextView) findViewById(R.id.txttitle);
        tvdescription = (TextView) findViewById(R.id.txtdescription);
        tvcategory = (TextView) findViewById(R.id.txtcategory);
        img = (ImageView) findViewById(R.id.videothumbnail);

        radioGroup = findViewById(R.id.radioGroup);
        checkBox = findViewById(R.id.check_payment);
        layout_payment = findViewById(R.id.layout_payment);

        btn_order = (Button) findViewById(R.id.btn_order);
        editText = (EditText) findViewById(R.id.remitente);

        for (int i = 1; i <= 4; i++) {
            RadioButton radioButton = new RadioButton(this);
            radioButton.setId(i);
            radioButton.setText("Horario " + i);
            radioButton.setGravity(Gravity.CENTER);
            radioButton.setTextSize(18);

            radioGroup.addView(radioButton);
        }

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Cambiar la visibilidad del LinearLayout
                if (isChecked) {
                    layout_payment.setVisibility(View.VISIBLE);
                } else {
                    layout_payment.setVisibility(View.GONE);
                }
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton selectedRadioButton = findViewById(checkedId);
                String selectedText = selectedRadioButton.getText().toString();
                Toast.makeText(Video_Activity.this, "Seleccionado: " + selectedText, Toast.LENGTH_SHORT).show();
            }
        });

        btn_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(Video_Activity.this, MainActivity.class);
                Toast.makeText(Video_Activity.this, "Procesado: " + editText.getText(), Toast.LENGTH_SHORT).show();
                startActivity(itn);
            }
        });

        //recibir data
        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Description = intent.getExtras().getString("Description");
        String Category = intent.getExtras().getString("Category");
        int Imagen = intent.getExtras().getInt("Thumbnail");

        tvtitle.setText(Title);
        tvdescription.setText(Description);
        tvcategory.setText(Category);
        img.setImageResource(Imagen);
    }
}