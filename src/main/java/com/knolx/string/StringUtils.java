package com.knolx.string;

import java.util.List;
import java.util.stream.Collectors;

public class StringUtils {
    public static void main(String[] args) {
        // isBlank()
        String name = "";
        System.out.println(name.isEmpty()); // true
        
        String name1 = " ";
        System.out.println(name1.isEmpty()); // false
        
        String name2 = " ";
        System.out.println(name2.isBlank()); // true
        
        String name3 = "";
        System.out.println(name3.isBlank()); // true
        
        // lines()
        String name4 = "Deepak\nMehra";
        List<String> list = name4.lines().collect(Collectors.toList());
        System.out.println(list); // [Deepak, Mehra]
        
        // strip(), stripLeading(), stripTrailing()
        String name5 = " Deepak Mehra ";
        System.out.println(name5.strip()); // Deepak Mehra(Whitespaces removed already)
        
        String name6 = " Deepak Mehra ";
        System.out.println(name6.stripLeading()); // Removes only leading whitespaces
        
        String name7 = " Deepak Mehra ";
        System.out.println(name7.stripTrailing()); // Removes only trailing whitespaces
        
        // repeat(int value)
        String name8 = "Deepak";
        System.out.println(name8.repeat(4)); // DeepakDeepakDeepakDeepak
        
    }
}
