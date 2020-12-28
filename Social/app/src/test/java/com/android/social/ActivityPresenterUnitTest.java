package com.android.social;

import android.graphics.Color;

import com.android.social.interfacetest.ActivityViewInterface;
import com.android.social.presentertest.ActivityPresenter;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class ActivityPresenterUnitTest extends TestCase {

ActivityPresenter activityPresenter;

@Mock
    ActivityViewInterface activityView;

@Before
    public void setup() throws Exception{
    activityPresenter= new ActivityPresenter(activityView);
}

@Test
    public void testIfPresenterUpdateClickable(){
    boolean clickable= false;
    ActivityPresenter.setButtonClickable(clickable);
    Mockito.verify(activityView).updateButtonClickable(clickable);
}
    @Test
    public void testIfPresenterUpdateButtonColorIII(){
        int buttonCollor=R.color.colorIII;
        ActivityPresenter.setButtonCollor(buttonCollor);
        Mockito.verify(activityView).updateButtonColor(buttonCollor);
    }

}