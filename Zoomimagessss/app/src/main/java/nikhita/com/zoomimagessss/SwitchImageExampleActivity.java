package nikhita.com.zoomimagessss;

/**
 * Created by meghana on 5/13/2016.
 */
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class SwitchImageExampleActivity extends Activity {

    private TouchImageView image;
    private static int[] images = { R.drawable.sfw, R.drawable.tmd, R.drawable.tmft, R.drawable.wom };
    int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch_image_example);
        image = (TouchImageView) findViewById(R.id.img);
        index = 0;
        //
        // Set first image
        //
        setCurrentImage();
        //
        // Set next image with each button click
        //
        image.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                setCurrentImage();
            }
        });
    }

    private void setCurrentImage() {
        image.setImageResource(images[index]);
        index = (++index % images.length);
    }

}