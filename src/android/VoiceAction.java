package xyz.sheyar.plugin;

import org.json.JSONArray;

/**
 * Created by bhanuka on 4/4/17.
 */
public abstract class VoiceAction {

    protected String action;

    public abstract JSONArray transform();

}
