package com.android.social;

import com.android.social.fragment.HomeFragment;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.anything;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class HomeFragmentUITesting {

    @Rule
    public ActivityScenarioRule<MainActivity> homeFragmentActivityScenarioRule = new ActivityScenarioRule<MainActivity>(MainActivity.class);

    @Test
    public void RecyclerViewHomeTest(){
        onView(withId(R.id.recyclerView_home)).perform(RecyclerViewActions.actionOnItemAtPosition(2, click()));
    }

    //OR

    @Test
    public void clickOnItemWithTextEqualToTwo() {
        // Directly specify the position in the adapter to click on
        onData(anything()) // We are using the position so don't need to specify a data matcher
                .inAdapterView(withId(R.id.recyclerView_home)) // Specify the explicit id of the RecyclerView
                .atPosition(1) // Explicitly specify the adapter item to use
                .perform(click()); // Standard ViewAction
    }
}
