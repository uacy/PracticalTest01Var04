package ro.pub.cs.systems.eim.practicaltest01var04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int SECONDARY_ACTIVITY_REQUEST_CODE = -1;

    private EditText editText = null;
    private Button button = null;
    private ButtonClickListener buttonClickListener = new ButtonClickListener();

    private class ButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            if (view.getId() == R.id.button) {
                Intent intent = new Intent(getApplicationContext(), PracticalTest01Var04PlayActivity.class);
                int number = Integer.parseInt(editText.getText().toString());
                intent.putExtra("numberOfClicks", number);
                startActivityForResult(intent, SECONDARY_ACTIVITY_REQUEST_CODE);
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var04_choose_number);

        editText = (EditText)findViewById(R.id.edit_text);
        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(buttonClickListener);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        if (requestCode == SECONDARY_ACTIVITY_REQUEST_CODE) {
            Toast.makeText(this, "The activity returned with result " + resultCode, Toast.LENGTH_LONG).show();
        }
    }
}
