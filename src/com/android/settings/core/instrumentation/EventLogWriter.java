/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.settings.core.instrumentation;

import android.content.Context;

import com.android.internal.logging.MetricsLogger;

/**
 * Pass-through Metrics logger for {@link MetricsLogger}.
 */
public class EventLogWriter {

    public void visible(Context context, int category) {
        MetricsLogger.visible(context, category);
    }

    public void hidden(Context context, int category) {
        MetricsLogger.hidden(context, category);
    }

    public void action(Context context, int category) {
        MetricsLogger.action(context, category, "");
    }

    public void action(Context context, int category, int value) {
        MetricsLogger.action(context, category, Integer.toString(value));
    }

    public void action(Context context, int category, boolean value) {
        MetricsLogger.action(context, category, Boolean.toString(value));
    }

    public void action(Context context, int category, String pkg) {
        MetricsLogger.action(context, category, pkg);
    }

    public void count(Context context, String name, int value) {
        MetricsLogger.count(context, name, value);
    }

    public void histogram(Context context, String name, int bucket) {
        MetricsLogger.histogram(context, name, bucket);
    }
}