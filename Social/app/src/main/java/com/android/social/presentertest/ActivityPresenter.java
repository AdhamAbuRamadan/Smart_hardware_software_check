package com.android.social.presentertest;

import com.android.social.R;
import com.android.social.interfacetest.ActivityPresenterInterface;
import com.android.social.interfacetest.ActivityViewInterface;

public class ActivityPresenter implements ActivityPresenterInterface {

    private ActivityViewInterface view;
    public ActivityPresenter( ActivityViewInterface activityViewInterface ){
     this.view = activityViewInterface;
    }

    @Override
    public void setButtonClickable( boolean clickable ) {

        view.updateButtonClickable(clickable);

    }

    @Override
    public void setButtonCollor( int buttonCollor, boolean clickable ) {
    if (clickable==false){
    setButtonCollor(R.color.colorIII,clickable);
    }
    }
}
