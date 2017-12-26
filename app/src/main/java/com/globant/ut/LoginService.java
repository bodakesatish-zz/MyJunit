package com.globant.ut;

/**
 * Created by satish.bodake on 26/12/17.
 */

class LoginService {

    private String username;
    private String password;

    boolean login(String username, String password)
    {

        if(username.equals("ram") & password.equals("laxman"))
            return true;
        else
            return false;
    }
}
