package com.geniusnine.android.mathsformulaandbraintrainergame.Contacts;

import android.database.Cursor;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.geniusnine.android.mathsformulaandbraintrainergame.R;

import java.util.ArrayList;

public class ContactView extends AppCompatActivity {

    ListView listView;
    contactadapter adapter;
    ArrayList<contact> contactlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_view);
        listView=(ListView) findViewById(R.id.listview);
        contactlist=new ArrayList<contact>();
        adapter=new contactadapter(ContactView.this,contactlist);
        listView.setAdapter(adapter);

        Cursor phone=getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,null,null,null,null);

        while(phone.moveToNext()){
            String name;
            String number;

            name=phone.getString(phone.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));
            number=phone.getString(phone.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));

            contact c=new contact();
            c.setName(name);
            Log.i("Query",c.name);
            c.setNumber(number);
            Log.i("Query",c.number);
            contactlist.add(c);



        }

        adapter.notifyDataSetChanged();
    }
}
