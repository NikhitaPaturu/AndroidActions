package nikhita.com.zoomimagessss;

/**
 * Created by meghana on 5/13/2016.
 */

import android.app.Activity;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;



public class SingleTouchImageViewActivity extends Activity {

    private TouchImageView image;
    private TextView scrollPositionTextView;
    private TextView zoomedRectTextView;
    private TextView currentZoomTextView;
    private DecimalFormat df;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_touchimageview);

        image = (TouchImageView) findViewById(R.id.img);

        //
        // Set the OnTouchImageViewListener which updates edit texts
        // with zoom and scroll diagnostics.
        //
        image.setOnTouchImageViewListener(new TouchImageView.OnTouchImageViewListener() {

            @Override
            public void onMove() {
                PointF point = image.getScrollPosition();
                RectF rect = image.getZoomedRect();
                float currentZoom = image.getCurrentZoom();
                boolean isZoomed = image.isZoomed();

            }
        });
    }
}