package com.example.aventurasdemarcoyluis.model.Items;

import com.example.aventurasdemarcoyluis.model.Characters.PrincipalCharacters.PrincipalCharacter;

/**
 * Class of Item RedMushroom
 */
public class RedMushroom implements Item {

    @Override
    public void use(PrincipalCharacter character) {
        character.useRedMushroom(this); }
}
