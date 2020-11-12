package com.NATE.service;


import com.NATE.dao.Userdao;

public class UserServiceImpl implements UserService {

    private Userdao userdao;

    public void setUserdao(Userdao userdao) {
        this.userdao = userdao;
    }

    public void getUser() {
        userdao.getUser();
    }


}
