package com.itmo.being;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;
import com.itmo.exception.*;
import com.itmo.act.Spell;

public abstract class Born {

    private String name;

    private List<Spell> skills;

    public void setSkills(List<Spell> spells) {
        this.skills = spells;
    }

    public List<Spell> getSkills() {
        return skills;
    }

    protected Born() {
        skills = new ArrayList<Spell>();
    }

    protected Born(String name) {
        this.name = name;
        skills = new ArrayList<Spell>();
    }

    public String getName() {
        try {
            if (name != "") {
                return name;
            } else {
                throw new ExistException("обнаружен неизвестная сущность");
            }
        } catch (ExistException ex) {
            return ex.getExc();

        }
    }

    public void setName(String name) {
        this.name = name;
    }
}
