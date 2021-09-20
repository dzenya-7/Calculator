package com.example.calculator_0.Facade;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public class NotificationFacade {
    public static void notificate(Context context,int NOTIFY_ID,String CHANNEL_ID,int id_icon,String title,String text){

        try{
            NotificationCompat.Builder builder =
                    new NotificationCompat.Builder(context, CHANNEL_ID)
                            .setSmallIcon(id_icon)
                            .setContentTitle(title)
                            .setContentText(text)
                            .setPriority(NotificationCompat.PRIORITY_DEFAULT);
            NotificationManagerCompat notificationManager =
                    NotificationManagerCompat.from(context);
            notificationManager.notify(NOTIFY_ID, builder.build());
        }
        catch (Exception e){
            Log.println(Log.ERROR,"Привет","Сообщение");
        }

    }
}
