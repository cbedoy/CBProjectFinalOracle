package controllers;

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
public class MasterBussinessController {

    private static MasterBussinessController masterBussinessController;

    public static MasterBussinessController getInstance(){
        if(masterBussinessController == null)
            masterBussinessController = new MasterBussinessController();
        return masterBussinessController;
    }



}
