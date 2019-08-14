package com.techcrevices.displaycontacts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    List<ContactModel> contactModelList = new ArrayList<>();
    ContactModel contactModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i = getIntent();
        contactModelList = (List<ContactModel>) i.getSerializableExtra("listitem");

        int ir = Integer.parseInt(getIntent().getStringExtra("position"));
        contactModel = contactModelList.get(ir);

        Toast.makeText(Main2Activity.this,""+contactModel.getMobile(),Toast.LENGTH_LONG).show();

    }
}
