package xyz.sheyar.plugin;

import android.content.Intent;
import android.util.Log;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


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

                callbackContext.success(this.voiceAction.transform());

            }

            else{

                callbackContext.success(this.getDefaultAction());

            }

            return true;

        }


        return false;

    }

    public void init(Intent intent) throws JSONException {

        this.voiceAction = VoiceActionFactory.getVoiceAction(intent);

        if(this.callbackContext != null && this.voiceAction != null){
            callbackContext.success(this.voiceAction.transform());
        }
    }

    private JSONObject getDefaultAction() throws JSONException {

        JSONObject obj = new JSONObject();

        obj.put("type", "None");

        return  obj;
    }

}
