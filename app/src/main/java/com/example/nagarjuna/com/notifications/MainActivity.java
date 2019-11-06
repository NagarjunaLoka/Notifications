package com.example.nagarjuna.com.notifications;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.app.NotificationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.nagarjuna.com.notifications.App.Channel1;
import static com.example.nagarjuna.com.notifications.App.Channel2;

public class MainActivity extends AppCompatActivity {

    private NotificationManagerCompat notificationManagerCompat;

    TextView tv1,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notificationManagerCompat=NotificationManagerCompat.from(this);

        tv1=findViewById(R.id.channel1);
        tv2=findViewById(R.id.channel2);




    }

    public void sendchannel1(View v){


        String title=tv1.getText().toString();
        String description=tv2.getText().toString();

        Notification notification=new NotificationCompat.Builder(this,Channel1)
                .setSmallIcon(R.drawable.ic_donut_large_black_24dp)
                .setContentTitle(title)
                .setContentText(description)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(title)
                .build()
                ;

        notificationManagerCompat.notify(1,notification);


    }

    public void sendchannel2(View v){


        String title=tv1.getText().toString();
        String description=tv2.getText().toString();

        Notification notification=new NotificationCompat.Builder(this,Channel2)
                .setSmallIcon(R.drawable.ic_directions_bike_black_24dp)
                .setContentTitle(title)
                .setContentText(description)
                .setPriority(NotificationCompat.PRIORITY_LOW)
                .build()
                ;

        notificationManagerCompat.notify(2,notification);


    }
}
