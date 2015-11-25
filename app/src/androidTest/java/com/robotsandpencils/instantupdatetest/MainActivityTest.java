package com.robotsandpencils.instantupdatetest;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.assertion.ViewAssertions.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static org.hamcrest.Matchers.*;

/**
 * Created by nealsanche on 2015-11-25.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testFindViewPerformActionAndCheckAssertion() {
        // Find Button and Click on it
        onView(withId(R.id.fab)).perform(click());

        onView(allOf(withId(android.support.design.R.id.snackbar_text), withText("My text")))
                .check(matches(isDisplayed()));
    }
}
