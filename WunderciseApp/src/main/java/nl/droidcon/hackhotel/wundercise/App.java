package nl.droidcon.hackhotel.wundercise;

import android.app.Application;

import io.relayr.RelayrSdk;

/**
 * Created by Konrad Olczak on 23/11/14.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        RelayrSdk.init(this);
    }

}
