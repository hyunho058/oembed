package com.example.oembed.codet;

import java.util.ArrayList;
import java.util.List;

public class Options03Friend {
    public String[] find(String[] names) {

        List<String> friends = new ArrayList<>();

        for (String name : names) {
            if (name.length() == 4) {
                friends.add(name);
            }
        }

        return friends.toArray(new String[0]);
    }
}
