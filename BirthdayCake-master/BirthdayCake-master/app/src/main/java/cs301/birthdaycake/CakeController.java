package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {
    private CakeView cakeView;
    private CakeModel cakeModel;
    public CakeController(CakeView view){
        this.cakeView = view;
        cakeModel = view.getCakeModel();
    }
    public void onClick(View v){
        Log.d(null, "Clicked");
        cakeModel.lit = false;
        cakeView.invalidate();

    }

    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
        if(isChecked){
            cakeModel.candles = true;
            cakeView.invalidate();

        }
        else{
            cakeModel.candles = false;
            cakeView.invalidate();

        }

    }

    //@Override
    //public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

    //}
    public void onProgressChanged(SeekBar s, int p, boolean f){
        this.cakeModel.numCand = p;
        this.cakeView.invalidate();

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }


}
