package com.esgi.architrademe.hexagonalArchi.application.events;

import com.esgi.architrademe.hexagonalArchi.application.Notifications;
import kernel.EventHandler;

public class ConsultantFoundEventHandler implements EventHandler<ConsultantFoundApplicationEvent> {

    private final Notifications notifications;

    public ConsultantFoundEventHandler(Notifications notifications) {
        this.notifications = notifications;
    }

    @Override
    public void handle(ConsultantFoundApplicationEvent event) {
        notifications.notify(String.format("Notification of accounts found %s .", event.consultantSearchCriteria().toString()));
    }

}