package com.mycompany.chatapp1;

import java.util.Scanner;

public class Registration {
    
    private String userName;
    private String userPassword;
    private String userCellPhoneNumber;
    
public Registration(String userName, String userPassword, String userCellphoneNumber){

        this.userName = userName;
        this.userPassword = userPassword;
        this.userCellPhoneNumber = userCellphoneNumber;
}

    public boolean check_forUserName(String userName){
        Scanner inputObject = new Scanner(System.in); 
        
        this.userName = userName;
        String nameOfTheUser = inputObject.nextLine();
        
        if(userName.contains("_") && userName.length() <= 5){
            this.userName = userName;
            System.out.println("User Name is Successfully Captured! ");
            return true;

        }else{
            System.out.println("Your User Name Is Not Succefully Caption! Try Again! ");
            return false;
        }
    }
    public boolean check_forUserPassword (String userPassword){
        Scanner inputObject = new Scanner(System.in);
        do{
            
        this.userPassword = userPassword;
        String password = inputObject.nextLine();
        
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
        if (hasUpperCase && hasNumber && hasUniqueCharacter && passwordHasLength){
            this.userPassword = userPassword;
            System.out.println("Password is Successfully Captured! ");
            return true;
        }
        else {
            System.out.println("Password is Captured Incorrectly! ");
            return false;
        }
        
      }
         while(userPassword.equalsIgnoreCase("Retry"));
        }
    
        
    public boolean check_forCellPhoneNumber(String userCellPhoneNumber){
        Scanner inputObject = new Scanner(System.in);

        this.userCellPhoneNumber = userCellPhoneNumber;
        String phoneNumber = inputObject.nextLine();
        
        
        if(phoneNumber.matches("^\\+27\\d{10}$")){
            System.out.println("");
            this.userCellPhoneNumber = phoneNumber;
            return true;
        }
        else{
            System.out.println("");
            return false;
        }
    }
    
    public String getcheck_CellPhoneNumber(){
        return userCellPhoneNumber;
    }
    
    public String getcheck_UserName(){
        return userName;
    }
    
    public String getcheck_UserPassword(){
        return userPassword;
    }
    
    public void RegistrationDetails(){
        System.out.println("====== Registration========");
        
        System.out.println("Enter Your User Name: " + userName);
        System.out.println("Enter Your Password: " + userPassword);
        System.out.println("Enter Your Cell Phone Number: " + userCellPhoneNumber);

  } 
}
