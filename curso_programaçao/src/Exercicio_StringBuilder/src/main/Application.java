package main;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Application {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip");
        Comment c2 = new Comment("Wow that´s awesome!");

        Post p1 = new Post(sdf.parse("23/09/2022 13:30:00"),"Traveling to new Zealand",
                "I´m going to visit this wonderful country",12);

        p1.addComents(c1);
        p1.addComents(c2);
        System.out.println(p1);

    }
}
