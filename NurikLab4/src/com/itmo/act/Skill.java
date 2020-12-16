package com.itmo.act;

import com.itmo.being.Born;
import com.itmo.notalive.Craft;

public class Skill implements Spell {

    private String name;
    private String how;
    private Born to;
    private Craft than;

    public Skill(String name) {
        this.name = name;
    }

    public Skill(String name, String how) {
        this.name = name;
        this.how = how;
    }

    public Skill(String name, Craft than) {
        this.name = name;
        this.than = than;
    }

    public Skill(String name, Born to, Craft than) {
        this.name = name;
        this.to = to;
        this.than = than;
    }

    public Skill(String name, String how, Craft than) {
        this.name = name;
        this.how = how;
        this.than = than;
    }

    public String getName() {
        return name;
    }

    public String getHow() {
        return how;
    }

    public Born getTo() {
        return to;
    }

    public Craft getThan() {
        return than;
    }
}
