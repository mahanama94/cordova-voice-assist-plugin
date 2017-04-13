package xyz.sheyar.plugin;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by bhanuka on 4/13/17.
 */
public class SettimerVoiceAction extends VoiceAction {

    public SettimerVoiceAction(Intent intent) {
        super(intent);
    }

    @Override
    public JSONObject transform() throws JSONException {

        Bundle extras = this.intent.getExtras();

        JSONObject obj = new JSONObject();

        obj.put("type", "SetTimer");
        obj.put("length", extras.getInt(AlarmClock.EXTRA_LENGTH));
        obj.put("message", extras.getInt(AlarmClock.EXTRA_MESSAGE));
        obj.put("skipUi", extras.getInt(AlarmClock.EXTRA_SKIP_UI));

        return obj;
    }
}
