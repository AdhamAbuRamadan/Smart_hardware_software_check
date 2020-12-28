package com.android.social.presentertest;

import com.android.social.R;
import com.android.social.interfacetest.HomeFragmentPresenterInterface;
import com.android.social.interfacetest.HomeFragmentViewInterface;

public class HomeFramentPresenter implements HomeFragmentPresenterInterface {

    private HomeFragmentViewInterface viewInterface;

    public HomeFramentPresenter(HomeFragmentViewInterface viewInterface){
        this.viewInterface = viewInterface;
    }

    @Override
    public void setImage(boolean isFavorite) {
        if (isFavorite == true){
            viewInterface.updateImage(R.drawable.ic_baseline_favorite_24);
        }else {
            viewInterface.updateImage(R.drawable.ic_outline_favorite_border);
        }
    }
}
