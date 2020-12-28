package com.android.social;

import com.android.social.interfacetest.ProfileViewInterface;
import com.android.social.presentertest.ProfilePresenter;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)

public class ProfilePresenterUnitTest  {
    ProfilePresenter profilePresenter;

    @Mock
    ProfileViewInterface profileViewInterface;

    @Before
    public void setup() throws Exception{
        profilePresenter=new ProfilePresenter(profileViewInterface);
    }
    @Test
    public void textprofilePresenterText(){
      int cout=10;
      String c=String.valueOf(cout);
      profilePresenter.setNameCout(cout);

        Mockito.verify(profileViewInterface).setNumberCount(c);

    }

}
