package me.whiteship.designpatterns._02_structure_patterns._11_flyweight._02_after;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
public final class Font {

    private final String family;
    private final int size;

}
