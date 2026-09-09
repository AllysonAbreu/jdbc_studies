package jdbc.l18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class MessageBundle {

    private static final String BASE_NAME = "messages";
    private static Locale currentLocale = new Locale("pt", "BR");
    private static ResourceBundle bundle = ResourceBundle.getBundle(BASE_NAME, currentLocale);

    public static void setLocale(Locale locale) {
        currentLocale = locale;
        bundle = ResourceBundle.getBundle(BASE_NAME, currentLocale);
    }

    public static String getMessage(String key) {
        try {
            return bundle.getString(key);
        } catch (Exception e) {
            return "???" + key + "???";
        }
    }

    public static String getMessage(String key, Object... params) {
        try {
            String message = bundle.getString(key);
            return String.format(message, params);
        } catch (Exception e) {
            return "???" + key + "???";
        }
    }

    public static void toggleLocale() {
        if (currentLocale.equals(new Locale("pt", "BR"))) {
            setLocale(new Locale("en", "US"));
        } else {
            setLocale(new Locale("pt", "BR"));
        }
    }
}
