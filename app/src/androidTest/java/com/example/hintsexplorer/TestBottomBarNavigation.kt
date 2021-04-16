package com.example.hintsexplorer

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.hintsexplorer.ui.MainActivity
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TestBottomBarNavigation {

    @Test
    fun testClickOnFavoritesBottomFromHome_NavigateToFavFragment(){
        // launch the main Activity
        ActivityScenario.launch(MainActivity::class.java)
        // Check if home fragment is displayed
        onView(withId(R.id.HomeFragment)).check(matches(isDisplayed()))
        // Navigate to fav Fragment
        onView(withId(R.id.favorisFragment)).perform(click())
        // Check if home fragment is displayed
        onView(withId(R.id.FavFragment)).check(matches(isDisplayed()))
    }

    @Test
    fun testClickOnFavoritesBottomFromHome_NavigateToProfileFragment_PressBakGoToHome(){
        // launch the main Activity
        ActivityScenario.launch(MainActivity::class.java)
        // Check if home fragment is displayed
        onView(withId(R.id.HomeFragment)).check(matches(isDisplayed()))
        // Navigate to fav Fragment
        onView(withId(R.id.profileFragment)).perform(click())
        // Check if home fragment is displayed
        onView(withId(R.id.ProfileFragment)).check(matches(isDisplayed()))
        // Check if back button work
        pressBack()
        onView(withId(R.id.HomeFragment)).check(matches(isDisplayed()))

    }


}