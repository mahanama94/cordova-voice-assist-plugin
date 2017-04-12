package xyz.sheyar.plugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

import javax.security.auth.callback.Callback;

public class VoiceCommand extends CordovaPlugin {

    private CallbackContext callbackContext = null;

    private VoiceAction voiceAction = null;

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("test")) {

            this.callbackContext = callbackContext;

            if(voiceAction != null){
                String message = "Voice action present";

                callbackContext.success(message);
            }

            else{
                String message = "No voice action present";

                callbackContext.success(message);
            }

            return true;

        }
        return false;

    }


    public void init(VoiceAction voiceAction){

        this.voiceAction = voiceAction;

        if(this.callbackContext != null){
            String message = " Some message from the voice command";
            callbackContext.success(message);
        }
    }
}
