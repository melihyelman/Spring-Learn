package com.melihyelman.learning_spring_framework.examples.c1;

import org.springframework.stereotype.Component;

@Component
public class MySqlDataService implements DataService {
    @Override
    public int[] retieveData() {
        return new int[] {1,2,3,4,5,};
    }
}
