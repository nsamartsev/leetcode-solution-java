package leetcode.medium.design;

import java.util.HashMap;
import java.util.Map;


/**
 * @author samartsev
 * @url: <a href="https://leetcode.com/problems/encode-and-decode-tinyurl/description/">Link</a>
 */

public class EncodeDecodeTinyUrl_535 {
    public static void main(String[] args) {
        Codec codec = new Codec();
        assert codec.decode(codec.encode("https://leetcode.com/problems/design-tinyurl")).equals("https://leetcode.com/problems/design-tinyurl");
    }

    static class Codec {

        // shortUrl, longUrl
        private final Map<String, String> storage = new HashMap<>();
        private String prefix = "https://short.ru/";

        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            String shortUrl = prefix + longUrl.hashCode();
            storage.put(shortUrl, longUrl);
            return shortUrl;
        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            return storage.get(shortUrl);
        }
    }

}
