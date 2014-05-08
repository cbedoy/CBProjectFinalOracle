package interfaces;

import java.util.HashMap;
import java.util.Objects;

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
public interface IModelDelegate {

    public enum ACTION_DB {
        NEW,
        DELETE,
        UPDATE,
        QUERY
    }

    public void executeActionWthData(HashMap<String, Object> dataModel, ACTION_DB action);


}
