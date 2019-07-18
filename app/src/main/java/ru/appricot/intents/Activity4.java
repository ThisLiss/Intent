package ru.appricot.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        onTextView();
    }
    private void onTextView() {
        String textAdress;
        String textTelephone;
        String textDate;
        String textFirstName;
        String textLastName;

        textFirstName = getIntent().getExtras().getString("firstName");
        textLastName = getIntent().getExtras().getString("lastName");
        textTelephone = getIntent().getExtras().getString("telephone");
        textDate = getIntent().getExtras().getString("date");
        textAdress = getIntent().getExtras().getString("adress");

        TextView firstName = findViewById(R.id.etFirstName);
        TextView lastName = findViewById(R.id.etLastName);
        TextView telephone = findViewById(R.id.etTelephone);
        TextView date = findViewById(R.id.etDate);
        TextView adress = findViewById(R.id.etAdress);

        firstName.setText(textFirstName);
        lastName.setText(textLastName);
        telephone.setText(textTelephone);
        date.setText(textDate);
        adress.setText(textAdress);
    }

 /*   @Override
    public void onBackPressed() {
    } */
}
