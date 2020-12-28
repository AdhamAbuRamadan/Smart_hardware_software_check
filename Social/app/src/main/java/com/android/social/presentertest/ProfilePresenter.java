package com.android.social.presentertest;

import com.android.social.interfacetest.ProfilePresenterInterface;
import com.android.social.interfacetest.ProfileViewInterface;

public class ProfilePresenter implements ProfilePresenterInterface {
    private ProfileViewInterface profileViewInterface;
    public ProfilePresenter(ProfileViewInterface profileViewInterface_){
        this.profileViewInterface=profileViewInterface_;
    }

    @Override
    public void setNameCout(int cout) {
        String cout_=String.valueOf(cout);
        profileViewInterface.setNumberCount(cout_);
    }


}
