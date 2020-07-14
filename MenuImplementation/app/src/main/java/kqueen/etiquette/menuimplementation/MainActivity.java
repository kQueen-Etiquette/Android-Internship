package kqueen.etiquette.menuimplementation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreatePanelMenu(int featureId, @NonNull Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.settings, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item_1:
                Intent intent = new Intent(android.content.Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(android.content.Intent.EXTRA_TEXT, "Hey!");
                startActivity(intent);
                return true;
            case R.id.item_2:
                Intent dial = new Intent(Intent.ACTION_DIAL);
                startActivity(dial);
                return true;
            case R.id.item_3:
                Intent gallery_intent = new Intent();
                gallery_intent.setType("image/*");
                gallery_intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivity(gallery_intent);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}