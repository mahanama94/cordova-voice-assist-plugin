package xyz.sheyar.plugin;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by bhanuka on 4/4/17.
 */
public class SetalarmVoiceAction extends VoiceAction {

    public SetalarmVoiceAction(Intent intent) {
        super(intent);
    }

    @Override
    public JSONObject transform() throws JSONException {

        Bundle extras = this.intent.getExtras();

        JSONObject obj = new JSONObject();

        obj.put("type", "SetAlarm");
        obj.put("hour", extras.getInt(AlarmClock.EXTRA_HOUR));
        obj.put("minutes", extras.getInt(AlarmClock.EXTRA_MINUTES));
        // complete others
        return obj;

    }
}
