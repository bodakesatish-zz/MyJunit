package com.globant.ut;

/**
 * Created by satish.bodake on 21/12/17.
 */

class MainPresenter {
    private MainViewInterface viewInterface;
    private PreferenceManager preferenceManager;


    public MainPresenter() {

    }

    public MainPresenter(MainViewInterface viewInterface, PreferenceManager preferenceManager) {
        this.viewInterface = viewInterface;
        this.preferenceManager = preferenceManager;
    }


    public void calculateSomeThing(int num1, int num2) {
        int ans = num1*num2;
        viewInterface.onCalculationComplete(ans);
    }

    public int calculateSome(int num1, int num2) {
        return num1*num2;
    }

    void navigateUser() {
        if(preferenceManager.isUserLoggedIn()) {
            viewInterface.showHomeActivity();
        }
        else {
            viewInterface.showLoginActivity();
        }
    }
}
