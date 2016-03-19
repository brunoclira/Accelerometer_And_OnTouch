package ifpb.edu.br.ontouch;

import android.app.Activity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.TextView;

public class MainActivity extends Activity implements OnTouchListener {

    TextView touchpad, tvX , tvY;
    GestureDetector gd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){

       touchpad = (TextView)findViewById(R.id.touchpad);
       tvX = (TextView)findViewById(R.id.tvX);
       tvY= (TextView)findViewById(R.id.tvY);
       //gd = new GestureDetector(this);
       touchpad.setOnTouchListener(this);

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        if(v.getId()==R.id.touchpad){

            tvX.setText("X: " + Float.toString(event.getX()));
            tvY.setText("Y: " + Float.toString(event.getY()));

            return true;
        }else{
            return false;
        }

    }
}
