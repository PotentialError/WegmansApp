package michaelrodyushkin.honorsmobileapps.wegmansapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ItemActivity extends AppCompatActivity {
    public static final String EXTRA_REPLY = "itemSelected";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);
    }
    public void sendBack(View v) {

        String item = ((Button)v).getText().toString();
        Intent i = new Intent();
        i.putExtra(EXTRA_REPLY, item);
        setResult(RESULT_OK, i);
        finish();
    }
}
