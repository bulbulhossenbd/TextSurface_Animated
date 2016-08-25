package com.bulbulhossen.textsurfacetutorial.Main_Package;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.bulbulhossen.textsurfacetutorial.R;
import com.bulbulhossen.textsurfacetutorial.Surface_Package.ShapeRevealLoopSample;

import su.levenetc.android.textsurface.TextSurface;

public class MainActivity extends AppCompatActivity {

    private TextSurface textSurface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textSurface = (TextSurface) findViewById(R.id.text_surface);
        ShapeRevealLoopSample.play(textSurface, getAssets());
/*        textSurface.

        textSurface.postDelayed(new Runnable() {
            @Override public void run() {
                show();
            }
        }, 1000);

        findViewById(R.id.btn_refresh).setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                show();
            }
        });

        CheckBox checkDebug = (CheckBox) findViewById(R.id.check_debug);
        checkDebug.setChecked(Debug.ENABLED);
        checkDebug.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Debug.ENABLED = isChecked;
                textSurface.invalidate();
            }
        });
    }

    private void show() {
        textSurface.reset();
        CookieThumperSample.play(textSurface, getAssets());*/
    }

}