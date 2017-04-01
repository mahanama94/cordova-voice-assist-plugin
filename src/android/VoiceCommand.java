package xyz.sheyar.plugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class VoiceCommand extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("greet")) {

            String name = data.getString(0);
            String message = "Hello Some other, " + name;

            callbackContext.success(message);

            return true;

        }
        return false;

    }
}
