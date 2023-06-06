import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class StringEncoder {
    public static void main(String[] args) {
        String[] strings = {
            "Hello, World!",
            "This is a test string.",
            "Special characters: !@#$%^&*()",
            "Spaces and symbols: !@# $%^&*()",
            "Unicode: こんにちは"
        };

        try {
            for (String str : strings) {
                String encodedString = URLEncoder.encode(str, "UTF-8");
                System.out.println("Original String: " + str);
                System.out.println("Encoded String: " + encodedString);
                System.out.println();
            }
        } catch (UnsupportedEncodingException e) {
            System.err.println("Error encoding string: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
