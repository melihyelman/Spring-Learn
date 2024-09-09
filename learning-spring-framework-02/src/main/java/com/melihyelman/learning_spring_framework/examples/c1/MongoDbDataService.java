package com.melihyelman.learning_spring_framework.examples.c1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDbDataService implements DataService {

    @Override
    public int[] retieveData() {
        return new int[] {0,10,20,30,40};
    }
}
