package kqueen.etiquette.contextimage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.menu);
        registerForContextMenu(button);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item_1:
                Toast.makeText(this, "Notification selected", Toast.LENGTH_SHORT).show();;
                return true;
            case R.id.item_2:
                Toast.makeText(this, "Help selected", Toast.LENGTH_SHORT).show();;
                return true;
            case R.id.item_3:
                Toast.makeText(this, "Settings selected", Toast.LENGTH_SHORT).show();;
                return true;
            case R.id.item_4:
                Toast.makeText(this, "Logout selected", Toast.LENGTH_SHORT).show();;
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }
}