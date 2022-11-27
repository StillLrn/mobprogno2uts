package com.example.uts_mobprog;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        List<Contact> Contacts = new ArrayList<Contact>();
        Contacts.add(new Contact("Arataki Itto","Inazuma","Geo",R.drawable.ellipse_1));
        Contacts.add(new Contact("Kaedehara Kazuha","Inazuma","Anemo",R.drawable.ellipse_2));
        Contacts.add(new Contact("Yae Miko","Inazuma","Electro",R.drawable.ellipse_3));
        Contacts.add(new Contact("Amber","Mondstadt","Pyro",R.drawable.ellipse_4));
        Contacts.add(new Contact("Alhaitham","Sumeru","Dendro",R.drawable.ellipse_5));
        Contacts.add(new Contact("Yelan","Liyue","Hydro",R.drawable.ellipse_6));
        Contacts.add(new Contact("Dainsleif","Kha'nriah","Star",R.drawable.ellipse_7));
        Contacts.add(new Contact("XinYan","Liyue","Pyro",R.drawable.ellipse_8));
        Contacts.add(new Contact("Zhongli","Liyue","Geo",R.drawable.ellipse_9));
        Contacts.add(new Contact("Hu Tao","Liyue","Pyro",R.drawable.ellipse_10));
        Contacts.add(new Contact("Rosaria","Mondstadt","Cryo",R.drawable.ellipse_11));
        Contacts.add(new Contact("Albedo","Mondstadt","Geo",R.drawable.ellipse_12));
        Contacts.add(new Contact("Yun Jin","Liyue","Geo",R.drawable.ellipse_13));
        Contacts.add(new Contact("Raiden Ei","Inazuma","Electro",R.drawable.ellipse_14));
        Contacts.add(new Contact("Gorou","Watatsumi Island","Geo",R.drawable.ellipse_15));
        Contacts.add(new Contact("Ajax","Sznechnaya","Hydro",R.drawable.ellipse_16));
        Contacts.add(new Contact("Cyno","Sumeru","Electro",R.drawable.ellipse_17));
        Contacts.add(new Contact("Kujou Sara","Inazuma","Electro",R.drawable.ellipse_18));
        Contacts.add(new Contact("Xiao","Liyue","Anemo",R.drawable.ellipse_19));
        Contacts.add(new Contact("Tighnari","Sumeru","Dendro",R.drawable.ellipse_20));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new RC_ViewAdapter(getApplicationContext(),Contacts));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.option_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem Contact)
    {
        switch (Contact.getItemId())
        {
            case R.id.Contact1:
                Toast.makeText(this,"Data Uploaded to Cloud",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Contact2:
                Toast.makeText(this,"Contact shared",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Contact3:
                Toast.makeText(this,"Go to settings",Toast.LENGTH_SHORT).show();
                return true;}
        return super.onOptionsItemSelected(Contact);
    }
}