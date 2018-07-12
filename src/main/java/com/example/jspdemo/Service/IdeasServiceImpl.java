package com.example.jspdemo.Service;

import com.example.jspdemo.RandomIdeas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class IdeasServiceImpl implements IdeasService{
    private RandomIdeas randomIdeas;

    @Autowired
    public IdeasServiceImpl(RandomIdeas randomIdeas) {
        this.randomIdeas = randomIdeas;
    }

    @Override
    public List<String> getIdeas(int count) {
        //ToDo Find a better alternative to this line:
        List<String> allIdeas = new CopyOnWriteArrayList<>(randomIdeas.getIdeas());

        List<String> result = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            if (allIdeas.size() == 0) {
                break;
            }

            int leftLimit = 0;
            int rightLimit = allIdeas.size();
            int generatedInt = leftLimit + (int) (Math.random() * (rightLimit - leftLimit));
            result.add(allIdeas.get(generatedInt));
            allIdeas.remove(generatedInt);
        }
        return result;
    }
}
