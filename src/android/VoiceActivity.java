package xyz.sheyar.plugin;

import android.os.Bundle;

import org.apache.cordova.CordovaActivity;
import android.widget.Toast;
/**
 * Created by bhanuka on 4/1/17.
 */
public class VoiceActivity extends CordovaActivity {

    public void onCreate(Bundle savedInstance){

        super.onCreate(savedInstance);

        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.getBoolean("cdvStartInBackground", false)) {
            moveTaskToBack(true);
        }

        // Set by <content src="index.html" /> in config.xml
        loadUrl(launchUrl);

        VoiceCommand plugin = (VoiceCommand)this.appView.getPluginManager().getPlugin("VoiceCommand");

        plugin.init(new SetalarmVoiceEvent());

        Toast.makeText(this.getApplicationContext(), "Setting info", 2000).show();

//        this.appView.getPluginManager().getPlugin("VoiceCommmand").execute("ACtion");
//
//        this.appView.postMessage("some", "Another");


    }
}
