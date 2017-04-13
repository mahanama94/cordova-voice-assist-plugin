package xyz.sheyar.plugin;

import android.app.SearchManager;
import android.content.Intent;
import android.provider.AlarmClock;
import android.provider.MediaStore;
import android.util.Log;

/**
 * Created by bhanuka on 4/12/17.
 */
public class VoiceActionFactory {

    private static String tag = "VoiceActionFactory";

    public static VoiceAction getVoiceAction(Intent intent){

        Log.d(tag, intent.getAction());

        if(AlarmClock.ACTION_SET_ALARM.equals(intent.getAction())){
            return new SetalarmVoiceAction(intent);
        }
        else if(AlarmClock.ACTION_SET_TIMER.equals(intent.getAction())){
            return new SettimerVoiceAction(intent);
        }
        else if(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA.equals(intent.getAction())){
            return new StillImageVoiceAction(intent);
        }
        else if(intent.getAction().equals("com.google.android.gms.actions.SEARCH_ACTION")){
            return new InappSearchAction(intent);
        }
        return null;

    }
}
