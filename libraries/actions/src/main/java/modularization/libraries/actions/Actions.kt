package modularization.libraries.actions

import android.content.Context
import android.content.Intent

object Actions {

    fun openHomeIntent(context: Context) =
        internalIntent(context, "com.jeroenmols.modularization.home.open")

    private fun internalIntent(context: Context, action: String) =
        Intent(action).setPackage(context.packageName)
}