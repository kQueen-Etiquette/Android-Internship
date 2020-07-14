package kQueen.etiquette.captureimage;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button capture, gallery;
    ImageView final_image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        capture = (Button) findViewById(R.id.capture);
        gallery = (Button) findViewById(R.id.gallery);
        final_image = (ImageView) findViewById(R.id.final_image);

        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setType("image/*");
                i.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(i, 0);
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
            }
        });

        capture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent image = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(image, 0);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap bitmap = (Bitmap) data.getExtras().get("data");
        final_image.setImageBitmap(bitmap);
    }

}