package com.example.androidsplashhw2.model;

public class Auth {
    private  static final String EMAIL = "masri_p@silpakorn.edu";
    private  static final String PASSWORD = "123456";

    private String mEmail ;
    private String mPassword ;

    public Auth(String email, String password) {
        this.mEmail = email;
        this.mPassword = password;
    }

   /*public String getEmail() {
       return mEmail;
   }

   public void setEmail(String email) {
       this.mEmail = email;
   }

   public String getPassword() {
       return mPassword;
   }

   public void setPassword(String password) {
       this.mPassword = password;
   }*/

    public boolean check()
    {
        if(mEmail.equals(EMAIL)&& mPassword.equals(PASSWORD)){
            return true ;
        } else {
            return false ;
        }
    }

}
