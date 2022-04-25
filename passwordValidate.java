package CDC;

import java.util.Scanner;

class passwordValidate{
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        User user = new User();
        user.setName(sc.next());
        user.setMobile(sc.next());
        user.setUsername(sc.next());
        user.setPassword(sc.next());
        System.out.println(validate(user));

    }

    public static String validate(User user) throws Exception {
        String password= user.getPassword();
        int countOfSpecial =0;
        int countOfNumber=0;
        if(password.length()< 10 || password.length()>20 ){
            throw  new  java.lang.Exception("Should be minimum of 10 characters and maximum of 20 characters");
        }
        for(int i=0; i< password.length() ; i++){
            char var = password.charAt(i);
            if(var == '!'|| var == '@' || var =='#' || var =='$' ||var =='%' || var =='^' ||var =='&' ||var =='*'){
                countOfSpecial ++;
            }
            if(var >= '0' && var<='9'){
                countOfNumber++;
            }
        }
        if(countOfSpecial==0){
            throw new java.lang.Exception("It should contain at least one special character");
        }
        if (countOfNumber==0){
            throw new java.lang.Exception("Should contain at least one digit");
        }else{
            return "valid Password" ;
        }

    }

}

class User{

    String name;
    String mobile;
    String username;
    String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
