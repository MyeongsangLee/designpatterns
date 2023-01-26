package me.whiteship.designpatterns._02_structure_patterns._11_flyweight._03_after;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@RequiredArgsConstructor
@ToString
public final class Font {
    private final String family;
    private final int fontSize;
}
