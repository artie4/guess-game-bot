package org.example.guess_game.dao;

import org.example.guess_game.model.WinCondition;

public interface DataBaseService {
    String getStats();

    String getUserStats(String name);

    void dataBaseUpdate(String name, int points, WinCondition winCondition);
}
