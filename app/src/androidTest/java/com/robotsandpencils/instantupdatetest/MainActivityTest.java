package com.robotsandpencils.instantupdatetest;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.assertion.ViewAssertions.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static org.hamcrest.Matchers.*;

/**
 * Created by nealsanche on 2015-11-25.
 */
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testFindViewPerformActionAndCheckAssertion() {
        mActivityRule.getActivity();

        // Find Button and Click on it
        onView(withId(R.id.fab)).perform(click());

        onView(allOf(withId(android.support.design.R.id.snackbar_text), withText("Do it Nao!")))
                .check(matches(isDisplayed()));
    }
}
