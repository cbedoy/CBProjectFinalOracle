package interfaces;

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
public interface ISwitchConnection {

    public enum KIND_CONNECTION{
        MYSQL,
        ORACLE,
        SQLITE
    }

    public void switchConnectionWithOption(KIND_CONNECTION connection);

}
