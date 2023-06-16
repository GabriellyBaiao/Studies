package com.gabrielly.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Backend backend = new Backend("Backend");
        Frontend frontend = new Frontend("Frontend");
        FullStack fullStack = new FullStack("Fullstack");


        List<Knowledge> knowledges = new ArrayList<>();
        knowledges.add(backend);
        knowledges.add(frontend);
        knowledges.add(fullStack);

        for(Knowledge knowledge: knowledges) {
            knowledge.emailSender();
        }
    }
}
