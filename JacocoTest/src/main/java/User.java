public class User {

    public String addUser(String Username){
        if(Username == null||Username.trim().length() == 0){
            return "Please provide the username";
        }
        else if(Username.equalsIgnoreCase("Admin")){
            return "Username Admin is not allowed";
        }
        else{
            return "User: " + Username + " is add successfully";
        }
    }

}
