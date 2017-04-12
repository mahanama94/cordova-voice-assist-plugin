package xyz.sheyar.plugin;

import org.json.JSONArray;

/**
 * Created by bhanuka on 4/4/17.
 */
public class SetalarmVoiceEvent extends VoiceAction {

    @Override
    public JSONArray transform() {
        JSONArray a = new JSONArray();
        a.put("Some");
        return a;
    }
}
