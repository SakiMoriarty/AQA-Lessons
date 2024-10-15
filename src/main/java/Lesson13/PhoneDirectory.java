package Lesson13;

import java.util.*;

public class PhoneDirectory {
    private Map<String, List<String>> directory;

    public PhoneDirectory(){
        directory = new HashMap<>();
    }

    public void add(String lastname, String phoneNumber) {
        directory.computeIfAbsent(lastname, k -> new ArrayList<>()).add(phoneNumber);
    }

    public List<String> get(String lastname) {
        return directory.getOrDefault(lastname, new ArrayList<>());
    }
}
