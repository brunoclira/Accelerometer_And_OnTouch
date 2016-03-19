package ifpb.edu.br.accelerometer;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends Activity implements SensorEventListener{

    private TextView xtext, ytext, ztext;
    private Sensor sensor;
    private SensorManager SM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Criando o SM
        SM = (SensorManager)getSystemService(SENSOR_SERVICE);

        //Criando o Acelerômetro
        sensor = SM.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        //Fazendo o Sensor Listener
        SM.registerListener(this, sensor, SensorManager.SENSOR_DELAY_NORMAL);

        xtext = (TextView)findViewById(R.id.xtext);
        ytext = (TextView)findViewById(R.id.ytext);
        ztext = (TextView)findViewById(R.id.ztext);

    }


    @Override
    public void onSensorChanged(SensorEvent event) {

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
