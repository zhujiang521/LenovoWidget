package com.zj.widget.screen

import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.graphics.RenderEffect
import android.graphics.Shader
import android.os.Bundle
import android.view.Window
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.RemoteViews
import com.zj.widget.R

/**
 * Implementation of App Widget functionality.
 */
class ClockAppWidget : AppWidgetProvider() {
    override fun onUpdate(
        context: Context,
        appWidgetManager: AppWidgetManager,
        appWidgetIds: IntArray
    ) {
        // There may be multiple widgets active, so update all of them
        for (appWidgetId in appWidgetIds) {
            updateClockAppWidget(context, appWidgetManager, appWidgetId)
        }
    }

    override fun onEnabled(context: Context) {
        // Enter relevant functionality for when the first widget is created
    }

    override fun onDisabled(context: Context) {
        // Enter relevant functionality for when the last widget is disabled
    }

    override fun onAppWidgetOptionsChanged(
        context: Context?,
        appWidgetManager: AppWidgetManager?,
        appWidgetId: Int,
        newOptions: Bundle?
    ) {
        super.onAppWidgetOptionsChanged(context, appWidgetManager, appWidgetId, newOptions)
    }

}

internal fun updateClockAppWidget(
    context: Context,
    appWidgetManager: AppWidgetManager,
    appWidgetId: Int
) {
    // Construct the RemoteViews object
    val views = RemoteViews(context.packageName, R.layout.clock_app_widget)
//    val effect = RenderEffect.createBlurEffect(15F, 15F, Shader.TileMode.DECAL)
//    views.set(R.id.clockFl,"setRenderEffect",Bundle().apply {
//        putParcelable("setRenderEffect",effect)
//    })
    // Instruct the widget manager to update the widget
    appWidgetManager.updateAppWidget(appWidgetId, views)
}