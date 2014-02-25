
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wndessy
 */
public class VarCommon {
    VarCommon(){
        
    }
    boolean isValid;
    
   String id ;
   String fmane;
   String lname;
   String mname;
   String gender;
   String roomNumber;
   String bioData;
   
   String adminFame;
   String adminLname;
   String adminGender;
   String adMinPassword;
   String AdminEmail;
   String adminUsername;

    public boolean isIsValid() {
        return isValid;
    }

    public void setIsValid(boolean isValid) {
        this.isValid = isValid;
    }

   
   
    public String getAdminUsername() {
        return adminUsername;
    }

    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
    }

   
   
    public String getAdminFame() {
        return adminFame;
    }

    public void setAdminFame(String adminFame) {
        this.adminFame = adminFame;
    }

    public String getAdminLname() {
        return adminLname;
    }

    public void setAdminLname(String adminLname) {
        this.adminLname = adminLname;
    }

    public String getAdminGender() {
        return adminGender;
    }

    public void setAdminGender(String adminGender) {
        this.adminGender = adminGender;
    }

    public String getAdMinPassword() {
        return adMinPassword;
    }

    public void setAdMinPassword(String adMinPassword) {
        this.adMinPassword = adMinPassword;
    }

    public String getAdminEmail() {
        return AdminEmail;
    }

    public void setAdminEmail(String AdminEmail) {
        this.AdminEmail = AdminEmail;
    }
   

   
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFmane() {
        return fmane;
    }

    public void setFmane(String fmane) {
        this.fmane = fmane;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getBioData() {
        return bioData;
    }

    public void setBioData(String bioData) {
        this.bioData = bioData;
    }
    
    public String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }
        return null;
    }
    
}
