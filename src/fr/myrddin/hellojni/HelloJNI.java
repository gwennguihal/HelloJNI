package fr.myrddin.hellojni;

import android.util.Log;

public class HelloJNI
{
	// native methods
	private native int jniGiveMeANumber();

	// java methods
	public void giveMeANumber()
	{
		int num = jniGiveMeANumber();
		Log.e("JNI", "Number : " + num );
	}

	static
	{
		System.loadLibrary("HelloJNI");
	}
}
