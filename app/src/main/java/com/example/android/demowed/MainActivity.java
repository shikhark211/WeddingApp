package com.example.android.demowed;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    RecyclerView eventRecycler;
    ArrayList<Event> eventList = new ArrayList<Event>();

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String EventName = "HALDI";
        Drawable EventPhoto = getResources().getDrawable(R.drawable.haldiimages);
        String EventDate = "5";
        String EventMonth = "June";
        String EventTime = "7:30";
        String EventVenue = "Exposition Hall";
        Event E = new Event();
        E.EventName = EventName;
        E.EventDate = EventDate;
        E.EventMonth = EventMonth;
        E.EventPhoto = EventPhoto;
        E.EventVenue = EventVenue;
        E.EventTime = EventTime;
        eventList.add(E);
        Event E1 = new Event();
         EventName = "SANGEET";
         EventPhoto = getResources().getDrawable(R.drawable.sangeet);
         EventDate = "6 ";
         EventMonth = "June";
         EventTime = "7:00 pm";
         EventVenue = "B hall";
        E1.EventName = EventName;
        E1.EventDate = EventDate;
        E1.EventMonth = EventMonth;
        E1.EventPhoto = EventPhoto;
        E1.EventVenue = EventVenue;
        E1.EventTime = EventTime;
        eventList.add(E1);
        Event E2 = new Event();
        EventName = "BARAAT";
        EventPhoto = getResources().getDrawable(R.drawable.baraat);
        EventDate = "7 ";
        EventMonth = "June";
        EventTime = "7:00 pm";
        EventVenue = "C hall";
        E2.EventName = EventName;
        E2.EventDate = EventDate;
        E2.EventMonth = EventMonth;
        E2.EventPhoto = EventPhoto;
        E2.EventVenue = EventVenue;
        E2.EventTime = EventTime;
        eventList.add(E2);
        Event E3 = new Event();
        EventName = "RECEPTION";
        EventPhoto = getResources().getDrawable(R.drawable.reception);
        EventDate = "8 ";
        EventMonth = "June";
        EventTime = "7:00 pm";
        EventVenue = "B hall";
        E3.EventName = EventName;
        E3.EventDate = EventDate;
        E3.EventMonth = EventMonth;
        E3.EventPhoto = EventPhoto;
        E3.EventVenue = EventVenue;
        E3.EventTime = EventTime;
        eventList.add(E3);
        eventRecycler = (RecyclerView) findViewById(R.id.event_recyclerview);
        EventAdapter myAdapter = new EventAdapter(this,eventList);
        eventRecycler.setAdapter(myAdapter);
        eventRecycler.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
