package ru.appricot.intents;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_1);

        Button buttonNext = findViewById(R.id.btnNext);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNextClick();
            }
        });
    }

    private void onNextClick() {
        EditText editTextFirstName = findViewById(R.id.etFirstName);
        EditText editTextLastName = findViewById(R.id.etLastName);

        String textFirstName = editTextFirstName.getText().toString();
        String textLastName = editTextLastName.getText().toString();

        Intent intent = new Intent(Activity1.this, Activity2.class);

        intent.putExtra("firstName", textFirstName);
        intent.putExtra("lastName", textLastName);

        startActivity(intent);

    }
}
