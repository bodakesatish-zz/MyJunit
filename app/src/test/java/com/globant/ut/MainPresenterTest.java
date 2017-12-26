package com.globant.ut;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by satish.bodake on 21/12/17.
 */

public class MainPresenterTest {

    MainPresenter presenter;

    @Before
    public void setup() {
        presenter = new MainPresenter();
    }


    @Test
    public void dataIsCalculated() throws Exception {
        presenter.calculateSomeThing(10,20);

    }

    @Test
    public void dataIsCalculatedA() throws Exception {
        //Assert.assertEquals(200,presenter.calculateSomeThing(10,20));
    }


}
