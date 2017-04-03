package ro.pub.cs.systems.eim.practicaltest01var04;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class PracticalTest01Var04PlayActivity extends AppCompatActivity {

    private Button checkButton = null;
    private Button generateButton = null;
    private Button backButton = null;
    private ButtonClickListener buttonClickListener = new ButtonClickListener();


    private class ButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.button1:
                    break;
                case R.id.button2:
                    break;
                case R.id.button3:
                    break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var04_play);

        generateButton = (Button) findViewById(R.id.button1);

        generateButton.setOnClickListener(buttonClickListener);

        backButton = (Button) findViewById(R.id.button);

        backButton.setOnClickListener(buttonClickListener);
        checkButton = (Button) findViewById(R.id.button);

        checkButton.setOnClickListener(buttonClickListener);


    }

}
