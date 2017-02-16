package nikhita.com.zoomssss;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        TouchImageView imgDisplay = (TouchImageView)findViewById(R.id.tiv);
        imgDisplay.setMaxZoom(8f);
        imgDisplay.setImageResource(R.drawable.sfw);
    }
}
