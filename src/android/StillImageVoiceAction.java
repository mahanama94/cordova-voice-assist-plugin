package xyz.sheyar.plugin;

import android.content.Intent;
import android.os.Bundle;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by bhanuka on 4/13/17.
 */
public class StillImageVoiceAction extends VoiceAction{

    public StillImageVoiceAction(Intent intent) {
        super(intent);
    }

    @Override
    public JSONObject transform() throws JSONException {
        Bundle extras = this.intent.getExtras();

        JSONObject obj = new JSONObject();

        obj.put("type", "TakeStillImage");

        return obj;
    }
}
