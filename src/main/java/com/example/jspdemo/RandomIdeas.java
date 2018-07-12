package com.example.jspdemo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class RandomIdeas {
    private List<String> ideas;

    public RandomIdeas() {
        this.ideas = Arrays.asList(
                "Start a fight with your SO. That will definitely make things interesting.",
                "Go shopping. You might be ugly but al least you'll be dressed nice",
                "Make a pie. Pies are nice. Just don't get any ideas... We've all seen American pie, you sicko!",
                "Clean your house. You know it will appreciate it...",
                "Go see a movie. Popcorn prices will cheer you up",
                "Walk your dog. Don't have a dog? Get one!",
                "Get drunk and tell everyone how much you love them",
                "Idea1",
                "Idea2",
                "Idea3",
                "Idea4",
                "Idea5"
        );
    }

    public List<String> getIdeas() {
        return ideas;
    }
}
