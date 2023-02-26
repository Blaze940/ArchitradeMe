package com.esgi.architrademe.hexagonalArchi.application.events;

import com.esgi.architrademe.hexagonalArchi.application.Notifications;
import kernel.EventHandler;

public final class ConsultantUpdatedEventHandler implements EventHandler<ConsultantUpdatedApplicationEvent> {

    private final Notifications notifications;

    public ConsultantUpdatedEventHandler(Notifications notifications) {
        this.notifications = notifications;
    }

    @Override
    public void handle(ConsultantUpdatedApplicationEvent event) {
        notifications.notify(String.format("Notification of the account updated %s .", event.consultantId().toString()));
    }
}
