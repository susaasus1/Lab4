package com.itmo;

import java.util.ArrayList;
import java.util.List;

import com.itmo.being.*;
import com.itmo.exception.*;
import com.itmo.notalive.*;
import com.itmo.act.*;

public class Main {
    public static void main(String[] args) {

        Brackets horn = new Brackets() {
            @Override
            public String brackets(String text) {
                return "(" + text + ")";
            }
        };

        Thing premiere = new Thing("премьере","О ");
        Thing drama = new Thing(" пьесы", premiere);
        System.out.println(drama.getTo().getDescription() + drama.getTo().getName() + drama.getName());

        Place.Time.setTime("Пока ");
        List<Spell> hemuSkills = new ArrayList<Spell>();
        Thing tea = new Thing(" чаем");
        Human guest = new Human(" гостей");
        hemuSkills.add(new Skill(" угощала", guest, tea));
        Place home = new Place("дома", " у себя");
        Human hemuliha = new Human("маленькая Хемулиха", hemuSkills, home);
        System.out.print(Place.Time.getTime() + hemuliha.getName() + hemuliha.getSkills().get(0).getName() + hemuliha.getSkills().get(0).getTo().getName() + hemuliha.getSkills().get(0).getThan().getName() + hemuliha.getWhere().getDescription());

        Thing poster = new Thing(" афишы", ", театральные"," продолжали кружиться");
        Place forest = new Place("лесом.", " над", poster);
        System.out.println(forest.getHas().getDescription() + forest.getHas().getName() + forest.getHas().getAction() + forest.getDescription());

        Place field = new Place("полянку", " на лесную");
        List<Spell> oneSkills = new ArrayList<Spell>();
        oneSkills.add(new Skill(" спланировала", field));
        Thing roof = new Thing(" крыша,", " которую", " просмолили.");
        oneSkills.add(new Skill(" и прилипла к", roof));
        Human oneOfThem = new Human("Одна из них", oneSkills);
        Place.Time.setTime(" только что");
        System.out.println(oneOfThem.getName() + oneOfThem.getSkills().get(0).getName() + oneOfThem.getSkills().get(0).getThan().getDescription() + oneOfThem.getSkills().get(1).getName() + oneOfThem.getSkills().get(1).getThan().getName() + oneOfThem.getSkills().get(1).getThan().getDescription() + Place.Time.getTime() + oneOfThem.getSkills().get(1).getThan().getAction());

        Place.Time.setTime("В тот же миг ");
        List<Spell> babySkills = new ArrayList<Spell>();
        babySkills.add(new Skill(" вскарабкались на", roof));
        Thing sheet = new Thing(" листок");
        babySkills.add(new Skill(" подобрать", " чтобы", sheet));
        babySkills.add(new Skill(" хотел", " первым"));
        Human snusmumrik = new Human(" Снусмумрик");
        babySkills.add(new Skill(" вручить", snusmumrik, sheet));
        List<Human> kids = new ArrayList<Human>();
        for (int i = 0; i < 24; i++) {
            kids.add(new Human(" малыш", babySkills, "Каждый из них"));
        }
        System.out.println(Place.Time.getTime() + kids.size() + kids.get(0).getName() + kids.get(0).getSkills().get(0).getName() + kids.get(0).getSkills().get(0).getThan().getName() + kids.get(0).getSkills().get(1).getHow() + kids.get(0).getSkills().get(1).getName() + kids.get(0).getSkills().get(1).getThan().getName() + ".");

        System.out.println(kids.get(0).getPronounName() + kids.get(0).getSkills().get(2).getName()  + kids.get(0).getSkills().get(2).getHow() + kids.get(0).getSkills().get(3).getName() + kids.get(0).getSkills().get(3).getThan().getName() + kids.get(0).getSkills().get(3).getTo().getName() + ".");

    }
}
