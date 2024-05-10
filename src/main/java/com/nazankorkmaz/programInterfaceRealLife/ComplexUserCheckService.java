package com.nazankorkmaz.programInterfaceRealLife;

public class ComplexUserCheckService implements IUserCheckService {

    @Override
    public  boolean checkUser(User user){
        if(user.getAge() >= 18  && user.getName().startsWith("Na")){
            return  true;
        }
        return  false;

    }
}
