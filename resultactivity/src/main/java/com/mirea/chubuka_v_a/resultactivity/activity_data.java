package com.mirea.chubuka_v_a.resultactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class activity_data extends AppCompatActivity {
    private EditText universityInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        universityInput = (EditText) findViewById(R.id.universityName);
    }

    public void onSendButtonClick(View view){
        String university = universityInput.getText().toString();
        Intent intent = new Intent();
        intent.putExtra("name", university);
        setResult(RESULT_OK, intent);
        finish();
    }
}