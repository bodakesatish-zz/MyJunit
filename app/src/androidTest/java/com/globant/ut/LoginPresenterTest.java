package com.globant.ut;

import org.junit.Before;
import org.junit.runner.RunWith;

/**
 * Created by satish.bodake on 26/12/17.
 */

public class LoginPresenterTest {

    private LoginPresenter presenter;
    private LoginView view;
    private LoginService service;


    @Before
    public void setUp() throws Exception {

        presenter = new LoginPresenter(view, service);
    }
}
