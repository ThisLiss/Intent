package ru.appricot.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_2);

        Button buttonNext = findViewById(R.id.btn2Next);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNextClick();
            }
        });
    }

    private void onNextClick() {

        EditText editTextTelephone = findViewById(R.id.etTelephone);
        EditText editTextDate = findViewById(R.id.etDate);

        String textTelephone = editTextTelephone.getText().toString();
        String textDate = editTextDate.getText().toString();
        String textFirstName;
        String textLastName;

        textFirstName = getIntent().getExtras().getString("firstName");
        textLastName = getIntent().getExtras().getString("lastName");

        Intent intent = new Intent(Activity2.this, Activity3.class);

        intent.putExtra("firstName", textFirstName);
        intent.putExtra("lastName", textLastName);
        intent.putExtra("telephone", textTelephone);
        intent.putExtra("date", textDate);

        startActivity(intent);
    }
}
