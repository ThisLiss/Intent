package ru.appricot.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        Button buttonNext = findViewById(R.id.btnFin);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNextClick();
            }
        });
    }

    private void onNextClick() {

        EditText editTextAdress = findViewById(R.id.etAdress);

        String textAdress = editTextAdress.getText().toString();
        String textTelephone;
        String textDate;
        String textFirstName;
        String textLastName;

        textFirstName = getIntent().getExtras().getString("firstName");
        textLastName = getIntent().getExtras().getString("lastName");
        textTelephone = getIntent().getExtras().getString("telephone");
        textDate = getIntent().getExtras().getString("date");


        Intent intent = new Intent(Activity3.this, Activity4.class);

        intent.putExtra("firstName", textFirstName);
        intent.putExtra("lastName", textLastName);
        intent.putExtra("telephone", textTelephone);
        intent.putExtra("date", textDate);
        intent.putExtra("adress", textAdress);

        startActivity(intent.addFlags(
                Intent.FLAG_ACTIVITY_CLEAR_TASK).addFlags(
                Intent.FLAG_ACTIVITY_NEW_TASK));
    }
}
