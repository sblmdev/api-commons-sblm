package pe.gob.sblm.api.commons.utility;

import java.util.UUID;

public class GeneradorUID {

    public static String generateUniqueID(){
        UUID uID = UUID.randomUUID();
        return uID.toString();
    }


}
