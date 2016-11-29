package com.project.you_first;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.facebook.login.LoginManager;

/**
 * Created by Dawid on 14.04.2016.
 */
@SuppressWarnings("ALL")
public class FriendsActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friendslist);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
         //Error in the code/ cant find it
        /*AtomicReference<Intent> intent;
        intent = new AtomicReference<>(getIntent());
        String jsondata = intent.get().getStringExtra("jsondata");

        JSONArray friendslist;
        ArrayList<String> friends = new ArrayList<>();

        try {
            friendslist = new JSONArray(jsondata);
            for (int l=0; l < friendslist.length(); l++) {
                friends.add(friendslist.getJSONObject(l).getString("name"));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        ArrayAdapter adapter = new ArrayAdapter<>(this, R.layout.activity_listview); // simple textview for list item
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
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
            logout();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void logout(){

        Intent login = new Intent(FriendsActivity.this, LoginActivity.class);
        startActivity(login);
        LoginManager.getInstance().logOut();
        finish();
    }

}
