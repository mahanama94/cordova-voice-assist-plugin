package xyz.sheyar.plugin;

import android.os.Bundle;

import org.apache.cordova.CordovaActivity;
import org.json.JSONException;

import android.util.Log;

/**
 * Created by bhanuka on 4/1/17.
 */
public class VoiceActivity extends CordovaActivity {

    private static String TAG = "VoiceActivity";

    public void onCreate(Bundle savedInstance){

        super.onCreate(savedInstance);

        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.getBoolean("cdvStartInBackground", false)) {
            moveTaskToBack(true);
        }

        // Set by <content src="index.html" /> in config.xml
        loadUrl(launchUrl);

        VoiceCommand plugin = (VoiceCommand)this.appView.getPluginManager().getPlugin("VoiceCommand");

        try {
            plugin.init(getIntent());
        } catch (JSONException e) {
            Log.e(TAG, "JSON Exception");
            e.printStackTrace();
        }

    }
}
