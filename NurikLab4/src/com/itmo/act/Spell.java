package com.itmo.act;

import com.itmo.being.Born;
import com.itmo.notalive.Craft;

public interface Spell {

    String getName();

    String getHow();

    Born getTo();

    Craft getThan();
}
