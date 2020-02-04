package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button blowOutButton;
    private CompoundButton buttonSwitch;
    public void goodbye(View button){
        System.out.println("goodbye");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        CakeView CAkeView = findViewById(R.id.cakeview);

        CakeController ask = new CakeController(CAkeView);
        blowOutButton = findViewById(R.id.BlowBut);
        buttonSwitch = findViewById(R.id.candleSwi);
        SeekBar slider = findViewById(R.id.seekBar);
        blowOutButton.setOnClickListener(ask);
        buttonSwitch.setOnCheckedChangeListener(ask);
        slider.setOnSeekBarChangeListener(ask);
    }
}
