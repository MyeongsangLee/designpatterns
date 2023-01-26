package me.whiteship.designpatterns._02_structure_patterns._11_flyweight._03_after;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FontFactory {

    private Map<String, Font> cache = new HashMap<>();

    public Font getFont(String font) {
        if (cache.containsKey(font)) {
            return cache.get(font);
        } else {
            String[] split = font.split(":");
            Font newFont = new Font(split[0], Integer.parseInt(split[1]));
            cache.put(font, newFont);
            return newFont;
        }
    }

    public void printCache() {
        Set<String> strings = cache.keySet();
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
