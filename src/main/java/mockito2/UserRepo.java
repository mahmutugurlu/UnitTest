package mockito2;

//DB ile ilgili metodlar
public class UserRepo {


    //idsi verilen userı bulma
    public String getUsernameById(int userId){
        if (userId==1){
            return "Jack";
        } else if (userId==2) {
            return "Harry";
        } else if (userId==3) {
            return "Sherlock";
        }else {
            return null;
        }
    }
}
