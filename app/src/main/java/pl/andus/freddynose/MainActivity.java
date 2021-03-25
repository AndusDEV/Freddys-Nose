package pl.andus.freddynose;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

    private ImageView freddyIView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        freddyIView = (ImageView) findViewById(R.id.freddyView);
        freddyIView.setImageResource(R.drawable.freddy);

        Button nose = (Button)this.findViewById(R.id.btnNose);
        final MediaPlayer MpNose = MediaPlayer.create(this, R.raw.nose_sound);
        nose.setOnClickListener(new OnClickListener(){

            public void onClick(View v) {
                MpNose.start();
            }
        });
    }
}