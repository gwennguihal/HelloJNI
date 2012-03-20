package fr.myrddin.hellojni;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class HelloJNIActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        HelloJNI test = new HelloJNI();
        test.giveMeANumber();
    }
}