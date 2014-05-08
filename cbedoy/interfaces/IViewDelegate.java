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
public interface IViewDelegate {

    public enum ACTION_USER{
        USER_SELECT_QUERY,
        USER_SELECT_UPDATE,
        USER_SELECT_DELETE,
        USER_SELECT_NEW
    }

    public void userSelectedOption(ACTION_USER action_user);

}
