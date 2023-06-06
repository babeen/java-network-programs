import java.net.URI;
import java.net.URISyntaxException;

public class URIShifter {
    public static void main(String[] args) {
        String uriString = "https://www.example.com/path?param=value#fragment"; // Replace with the URI you want to shift

        try {
            URI uri = new URI(uriString);

            String scheme = uri.getScheme();
            String authority = uri.getAuthority();
            String path = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();

            System.out.println("Original URI: " + uriString);
            System.out.println("Scheme: " + scheme);
            System.out.println("Authority: " + authority);
            System.out.println("Path: " + path);
            System.out.println("Query: " + query);
            System.out.println("Fragment: " + fragment);

            // Shift the parts
            String shiftedURI = scheme + "://" + fragment + "." + authority + path + "?" + query;

            System.out.println("\nShifted URI: " + shiftedURI);
        } catch (URISyntaxException e) {
            System.err.println("Invalid URI: " + uriString);
            e.printStackTrace();
        }
    }
}
