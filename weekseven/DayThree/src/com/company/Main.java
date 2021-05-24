package com.company;

import com.company.entity.messageEntity;

public class Main {

    public static void main(String[] args) {
        messageEntity msg = new messageEntity("A message", "title");
        msg.setTitle("A different title");
        msg.setMessage("different message");
        msg.setRead(false);
        System.out.println(msg.getTitle());
        System.out.println(msg.getMessage());
        System.out.println(msg.isRead());
    }
}
