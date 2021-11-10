package com.vanced.manager.ui.widget.screens.settings

import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import com.vanced.manager.R
import com.vanced.manager.core.preferences.holder.managerAccentColorPref
import com.vanced.manager.ui.component.color.ManagerColorPicker
import com.vanced.manager.ui.component.preference.DialogPreference
import com.vanced.manager.ui.resources.managerString
import com.vanced.manager.ui.theme.defAccentColor
import com.vanced.manager.ui.widget.button.ManagerResetButton
import com.vanced.manager.ui.widget.button.ManagerSaveButton

@Composable
fun SettingsAccentColorItem() {
//    var localAccentColor by remember { mutableStateOf(managerAccentColorPref.value.value) }
//    DialogPreference(
//        preferenceTitle = managerString(
//            stringId = R.string.settings_preference_accent_color_title
//        ),
//        preferenceDescription = "#" + Integer.toHexString(localAccentColor.toInt()),
//        buttons = { isShown ->
//            ManagerResetButton(
//                backgroundColor = Color(localAccentColor)
//            ) {
//                isShown.value = false
//                managerAccentColorPref.save(defAccentColor)
//            }
//            ManagerSaveButton(
//                backgroundColor = Color(localAccentColor)
//            ) {
//                isShown.value = false
//                managerAccentColorPref.save(localAccentColor)
//            }
//        }
//    ) {
//        ManagerColorPicker {
//            localAccentColor = it
//        }
//    }
}