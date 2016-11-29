package com.project.you_first;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.facebook.login.LoginManager;

/**
 * Created by x14488478 on 15/04/2016.
 */
public class ChatActivity extends AppCompatActivity {

        //@Override
        private EditText txtName,txtEmail;
        private TextView lblMessage;
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_chat);

            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);

            txtName = (EditText) findViewById(R.id.txtName);
            txtEmail = (EditText) findViewById(R.id.txtEmail);
            lblMessage = (TextView) findViewById(R.id.lblMessage);


        }
        public void btnSend_Click(View view) {
            lblMessage.setText("Your message has been sent");

        }
        public void btnReset_Click(View view)
        {
            txtName.setText("");
            txtEmail.setText("");
            lblMessage.setText("");
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

        Intent login = new Intent(ChatActivity.this, LoginActivity.class);
        startActivity(login);
        LoginManager.getInstance().logOut();
        finish();
    }

    }
