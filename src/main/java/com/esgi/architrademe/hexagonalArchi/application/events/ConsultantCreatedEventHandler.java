package com.esgi.architrademe.hexagonalArchi.application.events;

import com.esgi.architrademe.hexagonalArchi.application.Notifications;
import kernel.EventHandler;

public final class ConsultantCreatedEventHandler implements EventHandler<ConsultantCreatedApplicationEvent> {

    private final Notifications notifications;

    public ConsultantCreatedEventHandler(Notifications notifications) {
        this.notifications = notifications;
    }

    @Override
    public void handle(ConsultantCreatedApplicationEvent event) {
        notifications.notify(String.format("Notification of the account creation %s .", event.consultantId().toString()));
    }
}
