package com.todo.prework.mohammedfareed.codepathtodoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditTodo extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_todo);
        String text = getIntent().getStringExtra("name");
        editText = (EditText) findViewById(R.id.etEditItem);
        editText.setText(text);
        editText.requestFocus();
    }

    public void onSaveItem(View view) {
        Intent result = new Intent();
        result.putExtra("newValue", editText.getText().toString());
        result.putExtra("position", getIntent().getIntExtra("number", 0));
        setResult(RESULT_OK, result);
        finish();
    }

    @Override
    public void onBackPressed() {
        setResult(RESULT_CANCELED);
        super.onBackPressed();
    }
}
