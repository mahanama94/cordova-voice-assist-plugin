package xyz.sheyar.plugin;

import android.content.Intent;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by bhanuka on 4/4/17.
 */
public abstract class VoiceAction {

    /**
     * Intent trigering the application
     */
    protected Intent intent;

    public VoiceAction(Intent intent){
        this.intent = intent;
    }

    protected String action;

    public abstract JSONObject transform() throws JSONException;

}
