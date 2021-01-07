package michaelrodyushkin.honorsmobileapps.wegmansapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String NAME_KEY = "theNameOfTheCustomer";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button startList = findViewById(R.id.button);
        View.OnClickListener list = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchList();
            }
        };
        startList.setOnClickListener(list);
    }
    public void launchList() {
        Intent i = new Intent(this, GroceryListActivity.class);
        EditText nameFill = findViewById(R.id.name);
        String name = nameFill.getText().toString();
        i.putExtra(NAME_KEY, name);
        startActivity(i);
    }
}
