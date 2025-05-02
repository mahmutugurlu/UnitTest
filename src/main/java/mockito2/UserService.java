package mockito2;

public class UserService {

    private UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public String getUserNameById(int id){

        String username=userRepo.getUsernameById(id);

        if (username==null){
            throw new RuntimeException("User not found!");
        }

        return "Dear "+username;

    }


}