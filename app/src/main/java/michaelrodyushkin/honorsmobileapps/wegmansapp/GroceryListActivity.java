package michaelrodyushkin.honorsmobileapps.wegmansapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

import static michaelrodyushkin.honorsmobileapps.wegmansapp.ItemActivity.EXTRA_REPLY;
import static michaelrodyushkin.honorsmobileapps.wegmansapp.MainActivity.NAME_KEY;

public class GroceryListActivity extends AppCompatActivity {
    private static final int ITEM_REQUEST = 0;
    private ArrayList<String>  list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grocery_list);
        Intent i = getIntent();
        String name = "Welcome " + i.getStringExtra(NAME_KEY);
        TextView nameTag = findViewById(R.id.name);
        nameTag.setText(name);
    }
    public void launchItem(View v) {
        Intent send = new Intent(this, ItemActivity.class);
        startActivityForResult(send, ITEM_REQUEST);
    }
    public void addItemToList() {
        if(list.size() == 1) {
            TextView itemOne = findViewById(R.id.itemOne);
            itemOne.setText(list.get(0));
        }
        else if(list.size() == 2) {
            TextView itemTwo = findViewById(R.id.itemTwo);
            itemTwo.setText(list.get(1));
        }
        else if(list.size() == 3) {
            TextView itemThree = findViewById(R.id.itemThree);
            itemThree.setText(list.get(2));
        }
        else if(list.size() == 4) {
            TextView itemFour = findViewById(R.id.itemFour);
            itemFour.setText(list.get(3));
        }
        else if(list.size() == 5) {
            TextView itemFive = findViewById(R.id.itemFive);
            itemFive.setText(list.get(4));
        }
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent item) {
        super.onActivityResult(requestCode, resultCode, item);
        if(requestCode == ITEM_REQUEST && resultCode == RESULT_OK) {
            if(list.size() != 5) {
                list.add(item.getStringExtra(EXTRA_REPLY));
                addItemToList();
            }
        }
    }
}
