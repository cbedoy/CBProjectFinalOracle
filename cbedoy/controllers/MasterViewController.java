package controllers;

import interfaces.IView;

/**
 * --------------------------------------------------------
 * Created by Carlos Bedoy on 8/05/14.
 * CBFinalProjectOracle
 * Mobile Developer
 * Aguascalientes Mexico
 * Email:       carlos.bedoy@gmail.com
 * Facebook:    https://www.facebook.com/carlos.bedoy
 * ---------CODE && MUSIC ----------------------------------
 */
public class MasterViewController {
    private static MasterViewController masterViewController;

    public static MasterViewController getInstance(){
        if(masterViewController == null){
            masterViewController = new MasterViewController();
        }
        return masterViewController;
    }


}
