package xyz.sheyar.plugin;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by bhanuka on 4/14/17.
 */
public class InappSearchAction extends VoiceAction {

    public InappSearchAction(Intent intent) {
        super(intent);
    }

    @Override
    public JSONObject transform() throws JSONException {

        Bundle extras = this.intent.getExtras();

        JSONObject obj = new JSONObject();

        obj.put("type", "AppSearch");
        obj.put("query", extras.getString(SearchManager.QUERY));

        return obj;
    }
}
