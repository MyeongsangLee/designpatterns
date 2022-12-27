package me.whiteship.designpatterns._03_behavioral_patterns._18_memento._02_after;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
public class GameSave {

    private final int blueTeamScore;
    private final int redTeamScore;

}
