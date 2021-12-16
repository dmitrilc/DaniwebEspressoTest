package com.example.daniwebespressotest

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    /**
     * Check https://developer.android.com/training/testing/junit-rules#activity-test-rule
     */
    @get:Rule
    val activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testFinalTextView() {
        val testString = "Daniweb Espresso Test"

        onView(withId(R.id.editText_plaintTextInput)) //Obtains the TextEdit element
            .perform(typeText(testString)) //Add text to the TextEdit field

        onView(withId(R.id.button_submit)) //Obtains the Button element
            .perform(click()) //Click on the Submit button

        onView(withId(R.id.textView_finalText)) //Obtains the TextView element
            .check(matches(withText(testString))) //Checks if its value matches the submitted value
    }
}