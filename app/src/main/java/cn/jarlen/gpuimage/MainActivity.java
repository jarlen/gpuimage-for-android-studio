package cn.jarlen.gpuimage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button_gallery).setOnClickListener(this);
        findViewById(R.id.button_camera).setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_gallery:
                startActivity(ActivityGallery.class);
                break;
            case R.id.button_camera:
                startActivity(ActivityCamera.class);
                break;

            default:
                break;
        }
    }

    private void startActivity(final Class<?> activityClass) {
        startActivity(new Intent(this, activityClass));
    }
}
