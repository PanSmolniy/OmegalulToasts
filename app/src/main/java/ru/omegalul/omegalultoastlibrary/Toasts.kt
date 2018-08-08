package ru.omegalul.omegalultoastlibrary

import android.content.Context
import android.widget.Toast

fun Context?.omegalulToast() =
        this?.run { Toast.makeText(this, "Omegalul", Toast.LENGTH_LONG).show() }

fun Context?.c9Toast() =
        this.run { Toast.makeText(this, "C9", Toast.LENGTH_LONG).show() }

fun Context?.c8Toast() =
        this.run { Toast.makeText(this, "C8", Toast.LENGTH_LONG).show() }