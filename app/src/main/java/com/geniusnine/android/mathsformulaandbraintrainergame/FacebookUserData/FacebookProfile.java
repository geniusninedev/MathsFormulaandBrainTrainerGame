package com.geniusnine.android.mathsformulaandbraintrainergame.FacebookUserData;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.geniusnine.android.mathsformulaandbraintrainergame.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FacebookProfile extends AppCompatActivity {


    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListner;
    private DatabaseReference mDataBase;
    private Button submitButton;
    private EditText phoneNumber;
    private EditText postalAddress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);
        setContentView(R.layout.activity_facebook_profile);
        submitButton = (Button)findViewById(R.id.buttonSubmit) ;
        phoneNumber = (EditText)findViewById(R.id.editTextPhoneNumber);
        postalAddress = (EditText)findViewById(R.id.editTextPostalAddress);



        mAuth=FirebaseAuth.getInstance();
        mDataBase = FirebaseDatabase.getInstance().getReference().child("Users");

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InsertData();
            }
        });

    }

    private void InsertData(){
        String phone = phoneNumber.getText().toString();
        String postalAddr = postalAddress.getText().toString();

        String user_id = mAuth.getCurrentUser().getUid();
        DatabaseReference current_user_db = mDataBase.child(user_id);
        current_user_db.child("Phone").setValue(phone);
        current_user_db.child("PostalAddress").setValue(postalAddr);


    }


}