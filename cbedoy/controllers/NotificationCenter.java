package controllers;

import interfaces.INotification;

import java.util.ArrayList;

/**
 * --------------------------------------------------------
 * Created by Carlos Bedoy on 8/05/14.
 * CBFinalProjectOracle
 * Mobile Developer
 * Aguascalientes Mexico
 * Email:       carlos.bedoy@gmail.com
 * Facebook:    https://www.facebook.com/carlos.bedoy
 * ---------CODE && MUSIC ----------------------------------
 */
public class NotificationCenter {

    private static ArrayList<INotification> notifications;

    private static NotificationCenter notificationCenter;

    public static NotificationCenter getInstance(){
        if(notificationCenter == null){
            notificationCenter = new NotificationCenter();
            notifications = new ArrayList<INotification>();
        }
        return notificationCenter;
    }

    public void addObserver(INotification notification){
        this.notifications.add(notification);
    }

    public void removeObserver(INotification notification){
        this.notifications.remove(notification);
    }

    public void notifyChanges(){
        for(INotification notification : notifications){
            notification.reloadData();
        }
    }

}
