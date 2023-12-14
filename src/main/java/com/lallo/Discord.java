package com.lallo;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Discord {
    public static void main(String[] args) {
        JDA api = JDABuilder.createDefault("someTokenGoesHere").build();
    }
}
