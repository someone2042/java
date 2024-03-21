import java.io.IOException;
import java.util.prefs.Preferences;

import com.sun.security.auth.module.NTSystem;

public class CheckPassword {

    
    private static String getCurrentUsername() {
        NTSystem ntSystem = new NTSystem();
        return ntSystem.getName();
    }

    private static boolean hasPassword(String username) {
        try {
            // Open the Windows registry key for the current user
            Preferences userRoot = Preferences.userRoot();
            Preferences userKey = userRoot.node("Software\\Microsoft\\Windows\\CurrentVersion\\AccountPicture\\Users\\" + username);
    
            // Check if the registry key contains a value indicating password set
            String value = userKey.get("AADUserModeOnDesktop", null);
            return (value != null);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public static void main(String[] args) {
        String username = getCurrentUsername();
        if (username != null) {
            boolean hasPassword = hasPassword(username);
            if (hasPassword) {
                System.out.println("The current user has a password.");
            } else {
                System.out.println("The current user does not have a password.");
            }
        } else {
            System.out.println("Error: Unable to retrieve current username.");
        }
    }
}

