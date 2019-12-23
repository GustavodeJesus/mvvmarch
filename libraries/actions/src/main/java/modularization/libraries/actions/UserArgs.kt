package modularization.libraries.actions

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UserArgs(val userId: String) : Parcelable