
package com.wix.reactnativenotifications;

import android.content.Context;

import androidx.core.app.NotificationManagerCompat;
import androidx.annotation.NonNull;

public abstract class NotificationManagerCompatFacade {
    public static NotificationManagerCompat from(@NonNull Context context) {
        return NotificationManagerCompat.from(context);
    }
}
