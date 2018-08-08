package ru.omegalul.omegalultoastlibrary

import android.content.Context
import android.widget.Toast

fun Context?.omegalulToast() =
        this?.run { Toast.makeText(this, "Omegalul", Toast.LENGTH_LONG).show() }