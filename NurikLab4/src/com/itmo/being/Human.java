package com.itmo.being;

import java.util.List;
import com.itmo.notalive.*;
import com.itmo.act.*;

public class Human extends Born {

    private Craft where;
    private Pronoun rename;
    private static final boolean swapParameter = false;

    public Human(String name) {
        super(name);
    }

    public Human(String name, List<Spell> skillist) {
        super(name);
        setSkills(skillist);
    }

    public Human(String name, List<Spell> skillist, String rename) {
        super(name);
        setSkills(skillist);
        this.rename = new Pronoun(rename);

    }

    public Human(String name, List<Spell> skillist, Craft where) {
        super(name);
        setSkills(skillist);
        this.where = where;
    }

    public class Pronoun {
        private String pronoun;
        public Pronoun(String pronoun) {
            this.pronoun = pronoun;
        }

        public String getPronoun() {
            return this.pronoun;
        }
    }

    public String getPronounName() {
        class Local {
            String swap() {
                if (swapParameter) {
                    return getName();
                } else {
                    return rename.getPronoun();
                }
            }
        }
        Local local = new Local();
        return local.swap();
    }

    public Craft getWhere() {
        return where;
    }

}