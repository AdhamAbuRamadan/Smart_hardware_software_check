package com.android.social;

import com.android.social.interfacetest.HomeFragmentViewInterface;
import com.android.social.presentertest.HomeFramentPresenter;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class HomeFragmentPresenterTest {


    HomeFramentPresenter homeFramentPresenter;

    @Mock
    HomeFragmentViewInterface homeFragmentViewInterface;

    @Before
    public void setup() throws Exception{
        homeFramentPresenter = new HomeFramentPresenter(homeFragmentViewInterface);
    }


    @Test
    public void testIfPresenterUpdateImageColorRed(){
        boolean isFavorite = true;

        homeFramentPresenter.setImage(isFavorite);

        Mockito.verify(homeFragmentViewInterface).updateImage(R.drawable.ic_baseline_favorite_24);
    }

    @Test
    public void testIfPresenterUpdateImageColorGrey(){
        boolean isFavorite = false;

        homeFramentPresenter.setImage(isFavorite);

        Mockito.verify(homeFragmentViewInterface).updateImage(R.drawable.ic_outline_favorite_border);
    }

}
