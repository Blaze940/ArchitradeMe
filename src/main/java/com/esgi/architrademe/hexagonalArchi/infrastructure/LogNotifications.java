package com.esgi.architrademe.hexagonalArchi.infrastructure;

import com.esgi.architrademe.hexagonalArchi.application.Notifications;

public final class LogNotifications implements Notifications {
    @Override
    public void notify(String message) {
        System.out.println(message);
    }
}
