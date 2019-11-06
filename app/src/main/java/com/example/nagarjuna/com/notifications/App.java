package com.example.nagarjuna.com.notifications;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

public class App extends Application {

    public static final String Channel1="nagarjuna";
    public static final String Channel2="charan";

    @Override
    public void onCreate() {
        super.onCreate();

        CreateNoficationChannels();

    }
    private void CreateNoficationChannels(){//no orgs


        if(Build.VERSION.SDK_INT >=Build.VERSION_CODES.O) {  //comparing the versions her android Orio

            NotificationChannel notificationChannel = new NotificationChannel(   //creating notification chanels
                    Channel1,
                    "nagarjuna",
                    NotificationManager.IMPORTANCE_HIGH
            );

            notificationChannel.setDescription("from nagarjuna");


            //2nd notification channel

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {  //comparing the versions her android Orio

                NotificationChannel notificationChanne2 = new NotificationChannel(   //creating notification chanels
                        Channel2,
                        "charan",
                        NotificationManager.IMPORTANCE_LOW
                );

                notificationChanne2.setDescription("from charan");


                NotificationManager notificationManager=getSystemService(NotificationManager.class) ;

                notificationManager.createNotificationChannel(notificationChannel);
                notificationManager.createNotificationChannel(notificationChanne2);

            }

        }
    }

}
