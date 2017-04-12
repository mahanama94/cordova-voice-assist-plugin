package xyz.sheyar.plugin;

import android.content.Intent;
import android.util.Log;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;


public class VoiceCommand extends CordovaPlugin {

    private static String TAG = "VoiceCommandPlugin";

    private CallbackContext callbackContext = null;

    private VoiceAction voiceAction = null;

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("check")) {

            Log.d(VoiceCommand.TAG, "Voice Command Plugin Check");

            this.callbackContext = callbackContext;

            if(voiceAction != null){
                String message = "Voice action present";

                callbackContext.success(this.voiceAction.transform());

            }

            else{
                String message = "No voice action present";

                callbackContext.success(message);
            }

            return true;

        }


        return false;

    }

    public void init(Intent intent) throws JSONException {

        this.voiceAction = VoiceActionFactory.getVoiceAction(intent);

        if(this.callbackContext != null){
            callbackContext.success(this.voiceAction.transform());
        }
    }

}
