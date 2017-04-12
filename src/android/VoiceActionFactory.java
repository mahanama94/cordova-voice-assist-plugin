package xyz.sheyar.plugin;

import android.content.Intent;
import android.provider.AlarmClock;

/**
 * Created by bhanuka on 4/12/17.
 */
public class VoiceActionFactory {

    public static VoiceAction getVoiceAction(Intent intent){

        if(AlarmClock.ACTION_SET_ALARM.equals(intent.getAction())){
            return new SetalarmVoiceEvent(intent);
        }

        return null;

    }
}
