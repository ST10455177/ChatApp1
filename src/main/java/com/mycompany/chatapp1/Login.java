package com.mycompany.chatapp1;

import java.util.Scanner;

public class Login {
    
    public String userName;
    public String userPassword;
    
    public Login(String userName, String userPassword){
        
        this.userName = userName;
        this.userPassword = userPassword;
        
    }
    
    public boolean check_forUserName(String userName){
        Scanner inputObject = new Scanner(System.in);
        
        this.userName = userName;
        String UserName = inputObject.nextLine();
        
        if(userName.contains("_") && userName.length()<= 5){
            this.userName = userName;
            System.out.println("User Name Is Successfully Captured!!");
            return true;
        }
        else{
            System.out.println("Your User Name Is Invaild!!");
            return false;
        }
    }
    
    public boolean check_forUserPassword(String userPassword){
        Scanner inputObject = new Scanner(System.in);
        
        do{
            this.userPassword = userPassword;
            String UserPassword = inputObject.nextLine();
            
            boolean hasUpperCase = false;
            boolean hasNumber = false;
            boolean hasUniqueCharacter = false;
            boolean passwordHasLength = userPassword.length()>=8;
            
            int i = 0;
            
            while(i < userPassword.length()){
                char a = userPassword.charAt(i);
                
                if(Character.isUpperCase(a)){
                hasUpperCase = true;
                
            }
                else if(Character.isDigit(a)){
                    hasNumber = true;
                    
                }
                else if(Character.isLetterOrDigit(a)){
                    hasUniqueCharacter = true;
                    
                }
                    i++;
            }
            if(hasUpperCase && hasNumber && hasUniqueCharacter && passwordHasLength){
                this.userPassword = userPassword;
                System.out.println("Password Is Successfully Captured!");
                return true;
                
        }
            else{
                System.out.println("Password Is Captured Is Incorrectly!");
                return false;
            }
    }
        while(userPassword.equalsIgnoreCase("Retry"));
    }
    
    
    public void LoginDetails(){
        System.out.println("======Login=======");
        System.out.println("Enter your user name: " + userName);
        System.out.println("Enter Your Password: " + userPassword);
    }
   
}
    

