package com.example.aventurasdemarcoyluis.model.Items;

import com.example.aventurasdemarcoyluis.model.Characters.PrincipalCharacters.PrincipalCharacter;

/**
 * Class of Item HoneySyrup
 */
public class HoneySyrup implements Item {

    @Override
    public void use(PrincipalCharacter character) {
        character.useHoneySyrup(this);
    }
}
