package com.project.util;

import java.util.UUID;

public class GetUUID {
    public static void main(String[] args) {
        String string = UUID.randomUUID().toString();
        for (int i = 0; i <10 ; i++) {
            System.out.println(string);
        }
    }

}
