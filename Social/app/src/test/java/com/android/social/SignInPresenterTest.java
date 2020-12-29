package com.android.social.presentertest;

import com.android.social.interfacetest.SignInViewInterface;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(MockJUnitRunner.class)
public class SignInPresenterTest {
    SignInPresenter signInPresenter;

    @Mock
    SignInViewInterface signInViewInterface;


    @Before
    public  void setup()throws Exception{
        signInPresenter =new SignInPresenter(signInViewInterface);

    }
@Test
    public void testIfPresenterUpdateCharLeftBol(){
boolean result=true;
    String task=String.valueOf(result=false);

SignInPresenter.setTaskResult(result);
Mockito.verify(signInViewInterface).updateCharResult(result);

    }
}
