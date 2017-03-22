package com.adaptionsoft.games.uglytrivia;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Questions {

    private LinkedList<Question> questions = new LinkedList();

    public Questions() {
        // TODO do not use Cqtegory values, use Categories class:
        for (Category category : Category.values()) {
            for (int i = 0; i < 50; i++) {
                questions.addLast(new Question(category, String.valueOf(i)));
            }
        }
    }

    public Question next(Category category) {
        for (Question question : questions) {
            if (question.category() == category) {
                questions.remove(question);
                return question;
            }
        }
        throw new NoSuchElementException(category.toString());
    }
}
