/*
 * Author : Kevin A George
 Program to do validation of the User Interface
 */
package Assignment;

/**
 *
 * @author kevin
 */
public class Validation {
    
     public String Clear(){
         /*
         Method to clear all text fields
         */
         
        DetailsFrame.Firstnamefield.setText("");
        DetailsFrame.Middlenamefield.setText("");
        DetailsFrame.Lastnamefield.setText("");
        DetailsFrame.Address1field.setText("");
        DetailsFrame.Address2field.setText("");
        DetailsFrame.Cityfield.setText("");
        DetailsFrame.Statefield.setText("");
        DetailsFrame.Zipcodefield.setText("");
        DetailsFrame.Phonenumberfield.setText("");
        DetailsFrame.Countryfield.setText("");
        DetailsFrame.Emailfield.setText("");
         
        DetailsFrame.Firstnameresult = "false";
        DetailsFrame.Lastnameresult = "false";
        DetailsFrame.Address1result = "false";
        DetailsFrame.Cityresult = "false";
        DetailsFrame.Stateresult = "false";
        DetailsFrame.Zipcoderesult = "false";
        DetailsFrame.Phonenumberresult = "false";
        DetailsFrame.Countryresult = "false";
        DetailsFrame.Emailresult = "false";
        return "true" ;
    }
     /*
     Method to validate First name and Last name. This regular expression accepts only alphabets
     */
     public static boolean validateName(String name) {
                return name.matches("^(?!\\s*$)[-a-zA-Z ]*$");
        }
    /*
     Method to validate Address. This regular expression accepts only alphabets numbers
     spaces and dots.
     */
        public static boolean validateAddress(String address) {
               return address.matches("^[a-zA-Z0-9,. ]*$");
 
        }
    /*
     Method to validate phone number and zip code .Only accepts digits
     */
        public static boolean validatePhone(String phone) {
                return phone.matches("^[0-9]*$");
        }

        public static boolean validateEmail(String email) {
                return email.matches("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$");
        }
}
